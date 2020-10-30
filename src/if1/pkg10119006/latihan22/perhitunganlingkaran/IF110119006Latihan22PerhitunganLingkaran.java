/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan22.perhitunganlingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Perhitungan lingkaran
 */
public class IF110119006Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double diameter, jarijari, luas, keliling;
        
        System.out.println("=========Perhitungan Lingkaran==========");
        System.out.print("Masukkan Nilai diameter lingkaran : ");
        diameter = userInput.nextInt();
        
        jarijari = diameter / 2;
        luas = Math.PI * jarijari * jarijari;
        keliling = 2 * Math.PI * jarijari;
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println();
        System.out.println("=======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran = " + (int)jarijari + " cm");
        System.out.println("Luas Lingkaran = " + (df.format(luas)) + " cm");
        System.out.println("Keliling Lingkaran = " + (df.format(keliling))+ " cm");
    }
    
}
