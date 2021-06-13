/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.Koneksi.Koneksi;
import mvc.Model.Mahasiswa;
import mvc.DAOInterface.IMahasiswa;
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
public class DAOMahasiswa implements IMahasiswa{
    Connection connection;
    final String insert = "insert into tblmahasiswa (nim, nama,jk, alamat) VALUES (?, ?, ?,?);";
    final String update = "update tblmahasiswa set nim=?, nama=?, jk=?, alamat=? where id=? ;";
    final String delete = "delete from tblmahasiswa where id=? ;";
    final String select = "SELECT * FROM tblmahasiswa;";
    final String carinama = "SELECT * FROM tblmahasiswa where nama like ?";
    
    public DAOMahasiswa(){
        connection = Koneksi.connection();
    }
    
    @Override
    public void insert(Mahasiswa b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, b.getNim());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
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
    
    @Override
    public void update(Mahasiswa b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNim());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setInt(5, b.getId());
            statement.execute();
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
    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
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
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> lb = null;
        try {
            lb = new ArrayList<Mahasiswa>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Mahasiswa b = new Mahasiswa();
                b.setId(rs.getInt("id"));
                b.setNim(rs.getString("nim"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    // Cari
    public List<Mahasiswa> getCariNama(String nama) {
        List<Mahasiswa> lb = null;
        try {
            lb = new ArrayList<Mahasiswa>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Mahasiswa b = new Mahasiswa();
                b.setId(rs.getInt("id"));
                b.setNim(rs.getString("nim"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
}
