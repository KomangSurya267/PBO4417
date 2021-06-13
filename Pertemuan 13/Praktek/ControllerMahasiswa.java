/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOMahasiswa;
import mvc.DAOInterface.IMahasiswa;
import mvc.Model.Mahasiswa;
import mvc.Model.TableModelMahasiswa;
import mvc.View.FormMahasiswa;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Toshiba
 */
public class ControllerMahasiswa {
    FormMahasiswa frame;
    IMahasiswa implMahasiswa;
    List<Mahasiswa> lb;
    
    public ControllerMahasiswa(FormMahasiswa frame) {
        this.frame = frame;
        implMahasiswa = new DAOMahasiswa();
        lb = implMahasiswa.getAll();
    }
    
    // mengosongkan field
    public void reset() {
        frame.gettxtID().setText("");
        frame.gettxtNIM().setText("");
        frame.gettxtNama().setText("");
        frame.gettxtJk().setSelectedItem("");
        frame.gettxtAlamat().setText("");
    }
    
    public void isiTable() {
        lb = implMahasiswa.getAll();
        TableModelMahasiswa tmb = new TableModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row) {
        frame.gettxtID().setEditable(false);
        frame.gettxtID().setText(lb.get(row).getId().toString());
        frame.gettxtNIM().setText(lb.get(row).getNim());
        frame.gettxtNama().setText(lb.get(row).getNama());
        frame.gettxtJk().setSelectedItem(lb.get(row).getJk());
        frame.gettxtAlamat().setText(lb.get(row).getAlamat());
    }

    // fungsi untuk insert data berdasarkan inputan user dati textfield di frame
    public void insert() {
        
      if (!frame.gettxtNIM().getText().trim().isEmpty()& !frame.gettxtNama().getText().trim().isEmpty()) {
          
        Mahasiswa b = new Mahasiswa();
        b.setNim(frame.gettxtNIM().getText());
        b.setNama(frame.gettxtNama().getText());
        b.setJk(frame.gettxtJk().getSelectedItem().toString());
        b.setAlamat(frame.gettxtAlamat().getText());

        implMahasiswa.insert(b);
        JOptionPane.showMessageDialog(null, "Simpan Data sukses");
        
        } else {
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
    // berfungsi untuk update data berdasarkan inputan user dati textfield di frame
    public void update() {
        
            Mahasiswa b = new Mahasiswa();
            b.setNim(frame.gettxtNIM().getText());
            b.setNama(frame.gettxtNama().getText());
            b.setJk(frame.gettxtJk().getSelectedItem().toString());
            b.setAlamat(frame.gettxtAlamat().getText());
            b.setId(Integer.parseInt(frame.gettxtID().getText()));
            implMahasiswa.update(b);
            JOptionPane.showMessageDialog(null, "Update Data sukses");
        } 

    // berfungsi menghapus data yang dipilih
    public void delete() {
        if (!frame.gettxtID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame.gettxtID().getText());
            implMahasiswa.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan dihapus");
        }
    }
    public void isiTableCariNama() {
        lb = implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
        TableModelMahasiswa tmb = new TableModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void carinama() {
        if(!frame.getTxtCariNama().getText().trim().isEmpty()) {
            implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame, "SILAHKAN PILIH DATA");
        }
    }
}
