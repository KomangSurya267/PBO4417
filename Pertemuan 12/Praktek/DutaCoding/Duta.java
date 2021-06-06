/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

/**
 *
 * @author Toshiba
 */
public class Duta {
    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jk
     */
    public String getJk() {
        return jk;
    }

    /**
     * @param jk the jk to set
     */
    public void setJk(String jk) {
        this.jk = jk;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getUsia() {
        return usia;
    }

    /**
     * @param usia the usia to set
     */
    public void setUsia(String usia) {
        this.usia = usia;
    }
    
    public String getAlasan() {
        return alasan;
    }

    /**
     * @param alasan the alasan to set
     */
    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }   
    private String nik;
    private String nama;
    private String jk;
    private String alamat;
    private String usia;
    private String alasan;
}
