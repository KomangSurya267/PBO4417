import java.util.Scanner;

public class test {
    public static void main(String args[]){
        String InputNamaMahasiswa;
        String InputNim;
        // Nama Dosen
        String InputNamaDosen;
        // Mata Kuliah yang diampu
        String InputMataKuliah;
        // jadwal 
        String InputJadwal;
        int JumlahMahasiswa, JumlahDosen, Pilihan, NilaiPokok, NilaiTambahan;
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Selamat datang di Universitas Dian Nuswantoro");
        System.out.println("Silahkan mengisi jumlah mahasiswa dan dosen terlebih dahulu");
        System.out.print("\nJumlah Mahasiswa : ");
        JumlahMahasiswa = keyboard.nextInt();
        System.out.print("\nJumlah Dosen : ");
        JumlahDosen = keyboard.nextInt();

        String [][] mahasiswa = new String [JumlahMahasiswa][4];
        String [][] dosen = new String [JumlahDosen][2];
        String [][] matakuliah = new String [JumlahDosen][3];
        String [][] kelas = new String [JumlahMahasiswa][3];
        String [][] nilai = new String [JumlahMahasiswa][4];

        mahasiswa Mahasiswa = new mahasiswa();
        dosen Dosen = new dosen();
        matkul Matkul = new matkul();
        kelas Kelas = new kelas();
        nilai Nilai = new nilai();

        while (true) {
            System.out.println("");
            System.out.println("========== Menu Pilihan ==========");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Tambah Data Dosen");
            System.out.println("4. Tampilkan Data Dosen");
            System.out.println("5. Tambah Jadwal Mata Kuliah");
            System.out.println("6. Tampilkan Pilihan Mata Kuliah");
            System.out.println("7. Pilih mata kuliah");
            System.out.println("8. Masukkan nilai mahasiswa");
            System.out.println("9. Tampilkan nilai mahasiswa");
            System.out.println("10. Tampilkan kelas");
            System.out.println("11. Keluar");
            
            System.out.print("Masukkan pilihan anda : ");
            Pilihan = keyboard.nextInt();
            // Input biodata mahasiswa
            if(Pilihan == 1) {
                for(int i= 0; i < JumlahMahasiswa; i++) {
                    System.out.println("");
                    System.out.println("Data Mahasiswa ke " + (i+1));
                    for(int j = 0; j<2; j++) {      
                        if (j == 0) {
                            System.out.print("Nama Mahasiswa : ");    
                            mahasiswa[i][j] = keyboard.next();
                            nilai[i][j] = mahasiswa[i][j];
                            kelas[i][j] = mahasiswa[i][j];
                        }
                        else {
                            System.out.print("NIM : ");
                            mahasiswa[i][j] = keyboard.next();
                            nilai[i][j] = mahasiswa[i][j];
                            kelas[i][j] = mahasiswa[i][j];
                        }
                    }
                }
                System.out.print("");
            }
            // Output array Mahasiswa
            else if(Pilihan == 2) {
                System.out.println("");
                System.out.println("-----------------------------");
                System.out.println("Data Mahasiswa yang dimasukan :");
                Mahasiswa.printArrayMahasiswa(mahasiswa);
                System.out.println("");
            }
            // Input biodata dosen
            else if(Pilihan == 3) {
                for(int i= 0; i < JumlahDosen; i++) {
                    System.out.println("");
                    System.out.println("Data Dosen ke " + (i+1));
                    for(int j = 0; j<2; j++) {      
                        if (j == 0) {
                            System.out.print("Nama Dosen : ");    
                            dosen[i][j] = keyboard.next();
                            matakuliah[i][j] = dosen[i][j];
                        }
                        else {
                            System.out.print("Mata Kuliah yang diampu : ");
                            dosen[i][j] = keyboard.next();
                            matakuliah[i][j] = dosen[i][j];
                        }
                    }   
                }
            }
            // Output array Dosen
            else if(Pilihan == 4) {
                System.out.println("");
                System.out.println("-----------------------------");
                System.out.println("Data Dosen yang dimasukan :");
                Dosen.printArrayDosen(dosen);
                System.out.println("");
            }
            // Input mata kuliah
            else if(Pilihan == 5) {
                for(int i= 0; i < JumlahDosen; i++) {
                    System.out.println("");
                    System.out.println("Data Jadwal Pelajaran " + dosen[i][1] + ":");
                    System.out.print("Masukkan Jadwal : ");    
                    matakuliah[i][2] = keyboard.next();
                }
            }
            // Output Mata Kuliah
            else if(Pilihan == 6) {
                System.out.println("");
                System.out.println("-----------------------------");
                System.out.println("Data Mata Kuliah yang dimasukan : ");
                Matkul.printArrayMatkul(matakuliah);
                System.out.println("");
            }
            else if(Pilihan == 7) {
                System.out.println("Pilihan mata kuliah yang ditawarkan : ");
                Matkul.printArrayMatkul(matakuliah);
                for (int i= 0; i < JumlahMahasiswa; i++) {
                    System.out.println("");
                    System.out.print("Mahasiswa " + mahasiswa[i][1] + " memilih matkul : ");
                    int PilihanMataKuliah = keyboard.nextInt();
                    if (PilihanMataKuliah == 1) {
                        kelas[i][2] = dosen[i][1];
                        mahasiswa[i][2] = kelas[i][2];
                    }
                    else if (PilihanMataKuliah == 2) {
                        kelas[i][2] = dosen[i][1];
                        mahasiswa[i][2] = kelas[i][2];
                    }
                }
            }
            else if(Pilihan == 8) {
                for(int i= 0; i < JumlahMahasiswa; i++) {
                    System.out.println("");
                    System.out.println("Nilai mahasiswa ke " + (i+1));
                    System.out.print("Masukkan nilai pokok : ");    
                    NilaiPokok = keyboard.nextInt();
                    System.out.print("Masukkan nilai tambahan : ");
                    NilaiTambahan = keyboard.nextInt();
                    nilai[i][2] = Nilai.nilaiakhir(NilaiPokok, NilaiTambahan);
                    mahasiswa[i][3] = nilai[i][2];
                }
            }
            else if(Pilihan == 9) {
                System.out.println("");
                System.out.println("-----------------------------");
                System.out.println("Data Nilai yang dimasukan : ");
                Nilai.printArrayNilai(nilai);
                System.out.println("");
            }
            else if(Pilihan == 10) {
                System.out.println("");
                System.out.println("-----------------------------");
                System.out.println("Data Kelas yang dimasukan : ");
                Kelas.printArrayKelas(kelas);
                System.out.println("");
            }
            else if(Pilihan == 11) {
                System.exit(0);
            }
            else {
                System.exit(0);
            } 
        }
    }
}