import java.util.Scanner;
class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
}
public class BukuDemo {
    public static void main(String[] args){
        //Membuat objek
        Buku bukuku= new Buku();
        //Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        //Memanggil atribut dan memberi nilai
        System.out.print(" Judul :");
        bukuku.judul = keyboard.nextLine();
        System.out.print(" Pengarang :");
        bukuku.pengarang = keyboard.nextLine();
        System.out.print(" Penerbit :");
        bukuku.penerbit = keyboard.nextLine();
        System.out.print(" Tahun :");
        bukuku.tahun = keyboard.nextInt();
        System.out.print(" Judul :");
        bukuku.judul = keyboard.nextLine();
        System.out.print(" Pengarang :");
        bukuku.pengarang = keyboard.nextLine();
        System.out.print(" Penerbit :");
        bukuku.penerbit = keyboard.nextLine();
        System.out.print(" Tahun :");
        bukuku.tahun = keyboard.nextInt();
        System.out.println(" Press any key to continue... ");
    }
}