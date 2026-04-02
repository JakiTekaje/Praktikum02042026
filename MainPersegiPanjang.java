/*
Nama    : Ahmad Zaky, NIM  : 2501082008
Desk    : 
 */
package praktikum02042026;
import java.util.Scanner;

public class MainPersegiPanjang {

    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang=10;
        pp1.lebar=7;
        pp1.tampildata();
        
        System.out.println("\nObjek 1 Menggunakan consctructor 1");
        System.out.println("Akses Method dalam main class");
        System.out.println("Luas Persegi Panjang : "+pp1.HitungLuas());
        System.out.println("keliling Persegi Panjang : "+pp1.HitungKel());
        pp1.tampildata();
        
        System.out.println("\nObjek 2 Menggunakan consctructor 2");
        PersegiPanjang pp2 = new PersegiPanjang(19,10);
        pp2.tampildata();
        
        System.out.println("\nObjek 3 Menggunakan constructor 2");
        System.out.println("Panjang dan Lebar di-input user");
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Panjang = ");
        int panjang = input.nextInt();
        System.out.print("Masukkan Lebar = ");
        int lebar = input.nextInt();
        /*pp3.panjang = panjang;
        pp3.lebar = lebar;*/
        PersegiPanjang pp3 = new PersegiPanjang(panjang,lebar);
        pp3.tampildata();
    }   
}
