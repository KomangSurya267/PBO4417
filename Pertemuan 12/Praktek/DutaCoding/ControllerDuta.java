/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAODuta;
import mvc.DAOInterface.IDuta;
import mvc.Model.Duta;
import mvc.Model.TableModelDuta;
import mvc.View.FormDuta;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Toshiba
 */
public class ControllerDuta {
    FormDuta frame;
    IDuta implDuta;
    List<Duta> lb;
    
    public ControllerDuta(FormDuta frame) {
        this.frame = frame;
        implDuta = new DAODuta();
        lb =implDuta.getAll();
    }
    
    // mengosongkan field
    public void reset() {
        frame.gettxtNik().setText("");
        frame.gettxtNama().setText("");
        frame.gettxtJk().setSelectedItem("");
        frame.gettxtAlamat().setText("");
        frame.gettxtUsia().setText("");
        frame.gettxtAlasan().setText("");
    }
    
    public void isiTable() {
        lb = implDuta.getAll();
        TableModelDuta tmb = new TableModelDuta(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row) {
        frame.gettxtNik().setText(lb.get(row).getNik());
        frame.gettxtNama().setText(lb.get(row).getNama());
        frame.gettxtJk().setSelectedItem(lb.get(row).getJk());
        frame.gettxtAlamat().setText(lb.get(row).getAlamat());
        frame.gettxtUsia().setText(lb.get(row).getUsia());
        frame.gettxtAlasan().setText(lb.get(row).getAlasan());
    }

    // fungsi untuk insert data berdasarkan inputan user dati textfield di frame
    public void insert() {
        Duta b = new Duta();            
        b.setNik(frame.gettxtNik().getText());
        b.setNama(frame.gettxtNama().getText());
        b.setJk(frame.gettxtJk().getSelectedItem().toString());
        b.setAlamat(frame.getxtAlamat().getText());
        b.setUsia(Integer.parseInt(frame.gettxtUsia().getText()));
        b.setAlasan(frame.gettxtAlasan().getText());
        implDuta.insert(b);
        JOptionPane.showMessageDialog(null, "Simpan Data sukses");
    }
    // berfungsi untuk update data berdasarkan inputan user dati textfield di frame
    public void update() {
        if(!frame.gettxtID().getText().trim().isEmpty()) {
            Duta b = new Duta();
            b.setNik(frame.gettxtNik().getText());
            b.setNama(frame.gettxtNama().getText());
            b.setJk(frame.gettxtJk().getSelectedItem().toString());
            b.setAlamat(frame.gettxtAlamat().getText());
            b.setUsia(Integer.parseInt(frame.gettxtUsia().getText()));
            b.setAlasan(frame.gettxtAlasan().getText());            
            implDuta.update(b);
            JOptionPane.showMessageDialog(null, "Update Data sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan diupdate");
        }
    }
        
    // berfungsi menghapus data yang dipilih
    public void delete() {
        if(!frame.gettxtID().getText().trim().isEmpty()) {
            int nik = Integer.parseInt(frame.gettxtID().getText());
            implDuta.delete(nik);
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan dihapus");
        }
    }
}
