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
public class TableModelDuta {
    List<Duta> lb;
    public TableModelDuta(List<Duta> lb){
        this.lb = lb;
    }   
    public int getColumnCount(){
        return 5;
    }
    public int getRowCount(){
        return lb.size();
    }
    public String getColumnName(int column){
        switch(column){           
            case 0 :
                return "Nik";
            case 1 :
                return "Nama";
            case 2 :
                return "Kelamin";
            case 3 :
                return "Alamat";
            case 4 :
                return "Usia";
            case 5 :
                return "Alasan";
            default :
                return null;
        }
    }    
    public Object getValueAt(int row, int column){
    switch (column){           
            case 0 :
                return lb.get(row).getNik();
            case 1 :
                return lb.get(row).getNama();
            case 2 :
                return lb.get(row).getJk();
            case 3 :
                return lb.get(row).getAlamat();
            case 4 :
                return lb.get(row).getUsia();
            case 5 :
                return lb.get(row).getAlasan();
            default :
                return null;
    }
    }
}
