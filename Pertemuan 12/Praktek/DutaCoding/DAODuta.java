/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.Koneksi.Koneksi;
import mvc.Model.Duta;
import mvc.DAOInterface.IDuta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Toshiba
 */
public class DAODuta implements IDuta{
    Connection connection;
    final String insert = "INSERT INTO tblmahasiswa (nim, nama,jk, alamat) VALUES (?, ?, ?,?);";
    final String update = "UPDATE tblmahasiswa set nim=?, nama=?, jk=?, alamat=? where id=? ;";
    final String delete = "DELETE FROM tblmahasiswa where id=? ;";
    final String select = "SELECT * FROM tblmahasiswa;";
    
    public DAODuta(){
        connection = Koneksi.connection();
    }
    
    // insert
    public void insert(Duta b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, b.getNik());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setString(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.execute();           
        } catch (SQLException ex) {
            System.out.println("Berhasil Input");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }
    
    // Update
    public void update(Duta b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNik());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setString(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Update");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }
    
    public void delete(int nik) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, nik);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }
    
    // select
    public List<Duta> getAll() {
        List<Duta> lb = null;
        try {
            lb = new ArrayList<Duta>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Duta b = new Duta();                
                b.setNik(rs.getString("nik"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                b.setUsia(rs.getString("usia"));
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAODuta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
}
