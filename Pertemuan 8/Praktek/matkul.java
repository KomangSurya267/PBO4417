import java.util.Arrays;

public class matkul {
    String jadwal;
    
    // setter dan getter jadwal
    public void setjadwal(String jadwal){
        this.jadwal = jadwal;
    }
    public String getjadwal(){
        return jadwal;
    }

    public static void printArrayMatkul(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}