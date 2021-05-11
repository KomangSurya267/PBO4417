import java.util.Arrays;

public class dosen implements Udinus {
    String NamaDosen;
    String MataKuliah;

    public void setnama(String NamaDosen){
        this.NamaDosen = NamaDosen;
    }
    public String getnama(){
        return NamaDosen;
    }
    public void setMatakuliah(String MataKuliah){
        this.MataKuliah = MataKuliah;
    }
    public String getMataKuliah(){
        return MataKuliah;
    }

    public static void printArrayDosen(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}