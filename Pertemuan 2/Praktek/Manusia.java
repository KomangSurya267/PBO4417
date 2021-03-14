public class Manusia {
    String nama = "noname";
    boolean punyaTV = false;
    
    public Manusia(){}
    public Manusia(String nama){
        this.nama = nama;
    }
    public String namaSaya() {
        return nama;
    }
    public void beliTV(){
        punyaTV = true;
    }
    public void jualTV() {
        punyaTV = false;
    }
    public boolean cekTV(boolean punyaTV){
        return punyaTV;
    }
}