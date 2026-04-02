/*
Nama    : Ahmad Zaky, NIM  : 2501082008
Desk    : 
 */
package praktikum02042026;
import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
        
        //Objek 1 → constructor kosong
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Ahmad Zaky";
        mhs1.nobp = "2501082008";
        mhs1.tugas = 80;
        mhs1.uts = 85;
        mhs1.uas = 90;
        
        mhs1.data();
        System.out.println("Nilai Akhir : " + mhs1.hitung_nilai());
        System.out.println("Rata-rata   : " + mhs1.avg());
        
        //Objek 2 constructor berparameter
        Mahasiswa mhs2 = new Mahasiswa("Budiono Siregar", "2501082999", 75, 80, 85);
        mhs2.data();
        System.out.println("Nilai Akhir : " + mhs2.hitung_nilai());
        System.out.println("Rata-rata   : " + mhs2.avg());
        
        //Objek 3 → input user (optional tambahan)
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama   : ");
        String nama = input.nextLine();
        System.out.print("No BP  : ");
        String nobp = input.nextLine();
        System.out.print("Nilai Tugas : ");
        int tugas = input.nextInt();
        System.out.print("Nilai UTS   : ");
        int uts = input.nextInt();
        System.out.print("Nilai UAS   : ");
        int uas = input.nextInt();
        
        Mahasiswa mhs3 = new Mahasiswa(nama, nobp, tugas, uts, uas);
        
        System.out.println("\nData Mahasiswa 3");
        mhs3.data();
        System.out.println("Nilai Akhir : " + mhs3.hitung_nilai());
        System.out.println("Rata-rata   : " + mhs3.avg());
        
    }
}
