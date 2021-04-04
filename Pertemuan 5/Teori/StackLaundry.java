import java.util.Stack;

public class StackLaundry{
    static Stack<Integer> baju =  new Stack<>();
    static Stack<Integer> kaos =  new Stack<>();
    
    static void TambahBaju(){
        for (int i = 1; i < 10; i++){
            baju.push(i);
        System.out.println(" Tambah baju : " + i);
        }
        System.out.println("Total baju masuk mesin cuci : " + baju);
    }
    static void TambahKaos(){
        for (int i = 1; i < 5; i++){
            kaos.push(i);
        System.out.println(" Tambah kaos : " + i);
        }
        System.out.println("Total kaos masuk mesin cuci : " + kaos);
    }
}
class Kasir extends StackLaundry{
    static void BajuSiap(){
        Integer elements = (Integer) baju.pop();
        System.out.println("Baju selesai cuci : " + elements);
        System.out.println(" Sisa baju: " + baju);
    }
    static void KaosSiap(){
        Integer elements = (Integer) kaos.pop();
        System.out.println("Kaos selesai cuci : " + elements);
        System.out.println("Sisa kaos : " + kaos);
    }
    void output(){
        super.TambahBaju();
        BajuSiap();
        BajuSiap();
        super.TambahKaos();
        KaosSiap();
        KaosSiap();
    }
}