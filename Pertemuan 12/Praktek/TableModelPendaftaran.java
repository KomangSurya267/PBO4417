/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Toshiba
 */
public class TableModelPendaftaran {
    List<Pendaftaran> peserta;
    
    public TableModelPendaftaran(List<Pendaftaran> peserta) {
        this.peserta = peserta;
    }
    
    // Override
    public int getColumnCount() {
        return 7;
    }
    
    public int getRowCount() {
        return peserta.size();
    }
    
    public String getColumnName(int column) {
        switch (column) {
            case 0 :
                return "nik";
            case 1 : 
                return "nama";
            case 2 : 
                return "kelamin";
            case 3 : 
                return "alamat";
            case 4 : 
                return "usia";
            case 5 : 
                return "alasan";
            default : 
                return null;
        }
    }
    
    // Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0 :
                return peserta.get(row).getNik();
            case 1 : 
                return peserta.get(row).getNama();
            case 2 : 
                return peserta.get(row).getJk();
            case 3 : 
                return peserta.get(row).getAlamat();
            case 4 : 
                return peserta.get(row).getUsia();
            case 5 : 
                return peserta.get(row).getAlasan();
            default : 
                return null;
        }
    }
}
