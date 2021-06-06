/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAO.DAOPendaftaran;
import mvc.DAOInterface.IPendaftaran;
import mvc.Model.Pendaftaran;
import mvc.Model.TableModelPendaftaran;
import mvc.View.FormPendaftaran;
/**
 *
 * @author Toshiba
 */
public class ControllerPendaftaran {
    FormPendaftaran frame;
    IPendaftaran implPendaftaran;
    List<Pendaftaran> peserta;
    
    public ControllerPendaftaran(FormPendaftaran frame) {
        this.frame = frame;
        implPendaftaran = new DAOPendaftaran(); 
        peserta = implPendaftaran.getAll();
    }
    
    public void reset() {
        frame.getTxtNik().setText("");
        frame.getTxtNama().setText("");
        frame.getSetJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
        frame.getTxtUsia().setText("");
        frame.getTxtAlasan().setText("");
    }
        
    public void isiField(int row) {
        frame.getTxtNik().setText(peserta.get(row).toString());    
        frame.getTxtNama().setText(peserta.get(row).getNama());
        frame.getSetJk().setSelectedItem(peserta.get(row).getJk());
        frame.getTxtAlamat().setText(peserta.get(row).getAlamat());
        frame.getTxtUsia().setText(peserta.get(row).toString());
        frame.getTxtAlasan().setText(peserta.get(row).getAlasan());
    }
    
    public void insert() {
        Pendaftaran b = new Pendaftaran();
        b.setNik(Integer.parseInt(frame.getTxtNik().getText()));            
        b.setNama(frame.getTxtNama().getText());
        b.setJk(frame.getSetJk().getSelectedItem().toString());
        b.setAlamat(frame.getTxtAlamat().getText());
        b.setUsia(frame.getTxtUsia().getText());
        b.setAlasan(frame.getTxtAlasan().getText());
        implPendaftaran.insert(b);
        JOptionPane.showMessageDialog(null, "Simpan Data sukses");
    }
    
    // berfungsi untuk update data berdasarkan inputan user dati textfield di frame
    public void update() {
        if(!frame.getTxtNik().getText().trim().isEmpty()) {
            Pendaftaran b = new Pendaftaran();
            b.setNik(Integer.parseInt(frame.getTxtNik().getText()));
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getSetJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setUsia(frame.getTxtUsia().getText());
            b.setAlasan(frame.getTxtAlasan().getText());
            implPendaftaran.update(b);
            JOptionPane.showMessageDialog(null, "Update Data sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan diupdate");
        }
    }
    
    
    // berfungsi menghapus data yang dipilih
    public void delete() {
        if(!frame.getTxtNik().getText().trim().isEmpty()) {
            int nik = Integer.parseInt(frame.getTxtNik().getText());
            implPendaftaran.delete(nik);
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan dihapus");
        }
    }
    
}
