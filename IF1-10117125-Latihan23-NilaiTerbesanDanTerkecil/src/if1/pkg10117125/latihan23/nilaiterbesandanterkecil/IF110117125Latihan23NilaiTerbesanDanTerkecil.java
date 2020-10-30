/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan23.nilaiterbesandanterkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA : Zulfi Ihzam Rahmat
 * KELAS: IF-1
 * NIM  : 10117125
 * Deskripsi Program: Program ini berisi program yang menampilkan nilai terbesar
 * dan terkecil dari nilai mahasiswa
 */
public class IF110117125Latihan23NilaiTerbesanDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int nBanyak, nilai[];
        float rata = 0;
        String Nama;

        System.out.println("===program nilai terbesar dan "
                + "terkecil Nilai mahasiswa===");
        System.out.println("Masukkan Nama Petugas : ");
        Nama = input.nextLine();
        
        System.out.println("Masukkan Banyak Mahasiswa : ");
        nBanyak = input.nextInt();
        
        nilai = new int [nBanyak];
        
        for (int i = 0; i <= nBanyak - 1; i++) {
            System.out.println("Masukkan Nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            
        }
        int max = 0;
        for (int val : nilai) {
            if ( max < val){
                max = val;
            }
    }
        System.out.println("Nilai Terbesar adalah " + max);
        
        int min = nilai[0];
        for (int val : nilai) {
            if(val < min) { 
                min = val;
            }
    
        }
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("Petugas : " + Nama);
    }
    
}
