import java.util.Arrays;

public class mahasiswa implements Udinus {
    String NamaMahasiswa;
    String NIM;

    public void setNamaMahasiswa(String NamaMahasiswa){
        this.NamaMahasiswa = NamaMahasiswa;
    }
    public String getnama(){
        return NamaMahasiswa;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public String getNIM(){
        return NIM;
    }

    // gawe output array
    public static void printArrayMahasiswa(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}