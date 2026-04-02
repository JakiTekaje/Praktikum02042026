/*
Nama    : Ahmad Zaky, NIM  : 2501082008
Desk    : 
 */
package praktikum02042026;

public class PersegiPanjang {

        int panjang, lebar;
        
        PersegiPanjang(){
        
        }
        
        PersegiPanjang(int p, int l){
            panjang = p;
            lebar = l;
        }
        int HitungLuas(){
            return(panjang*lebar);
        }
        int HitungKel(){
            return(2*(panjang+lebar));
        }
        
        void tampildata(){
            System.out.println("Panjang persegi panjang : "+panjang);
            System.out.println("Lebar Persegi Panjang : "+lebar);
            System.out.println("Luas Persegi Panjang : "+HitungLuas());
            System.out.println("Keliling Persegi Panjang : "+HitungKel());
        }   
}
