import java.util.LinkedList;
import java.util.Queue;

public class LoketQueue{
    Queue<Integer> karcis =  new LinkedList<>();
    Queue<Integer> testpcr =  new LinkedList<>();
    public void KarcisKereta(){
        for (int i = 0; i < 20; i++)
            karcis.add(i);
        System.out.println("Jumlah Karcis : "+ karcis);   
    }
    public void TestPCR(){
        for (int i = 0; i < 5; i++)
            testpcr.add(i);
        System.out.println("Jumlah Test Covid : "+ testpcr);   
    }
}
class NomerKarcis extends LoketQueue{
    void HapusKarcis(){
        int delete = karcis.remove();
        System.out.println("Karcis yang di hapus = " + delete);
        System.out.println(karcis);
    }
    void Status(){
        int hapus = testpcr.remove();
        System.out.println("Test PCR sudah terpakai = " + hapus);
        System.out.println(testpcr);
    }
    void KarcisPertama(){
        int awal = karcis.peek();
        System.out.println("Angka Depan queue= " + awal);
    }
    void JumlahKarcis(){
        int jumlah = karcis.size();
        System.out.println("Jumlah Total Karcis = " + jumlah);
    }
    void JumlahTestPCR(){
        int total = testpcr.size();
        System.out.println("Jumlah Test PCR Sekarang = " + total);
    }
    void output(){
        super.KarcisKereta();
        HapusKarcis();
        HapusKarcis();
        KarcisPertama();
        JumlahKarcis();
        System.out.println("====================================================================================== " );
        super.TestPCR();
        Status();
        JumlahTestPCR();
    }
}

