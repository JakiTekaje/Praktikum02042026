/*
Nama    : Ahmad Zaky, NIM  : 2501082008
Desk    : 
 */

package praktikum02042026;
import java.util.Scanner;
public class Mahasiswa {
    String nama, nobp;
    double tugas, uts, uas,nilai_akhir, avg;
    
    Mahasiswa(){
        
    }
    
    Mahasiswa(String n, String nbp, int t, int u, int ua){
        nama = n;
        nobp = nbp;
        tugas = t;
        uts = u;
        uas = ua;
    }
        
    double hitung_nilai(){
        return(0.25 * tugas) + (0.35 * uts) + (0.4 * uas);
    }
    double avg (){
        return ((tugas+uts+uas)/3);
    }
    void data(){
    System.out.println("Nama : " + nama);
    System.out.println("No BP : " + nobp);
    }
}
