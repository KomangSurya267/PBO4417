import java.util.Arrays;

abstract class rumusnilai {
    int NilaiPokok;
    int NilaiTambahan;
    String nilai;
    String nilaiakhir(int NilaiPokok, int NilaiTambahan) {
        return nilai;
    }
}
public class nilai {
    int NilaiPokok;
    int NilaiTambahan;
    int Nilai;

    public String nilaiakhir(int NilaiPokok, int NilaiTambahan) {
        Nilai = ((6*NilaiPokok) + (4*NilaiTambahan)) / 10;
        String NilaiAkhir = String.valueOf(Nilai);
        return NilaiAkhir;
    }
    // mengembalikan nilai array
    public static void printArrayNilai(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}