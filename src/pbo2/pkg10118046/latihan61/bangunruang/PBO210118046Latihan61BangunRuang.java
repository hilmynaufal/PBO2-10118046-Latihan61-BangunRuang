/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan61.bangunruang;


/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menghiutng volume bangun ruang
 */
public class PBO210118046Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola(7);
        Tabung tabung = new Tabung(10, 21);
        Kerucut kerucut = new Kerucut(14, 9);
       
        
        System.out.println("Jari-Jari Bola: " + bola.getJariJari() + " cm\u00B3");
        System.out.printf("Volume Bola: %.1f", bola.hitungVolume());
        System.out.println(" cm\u00B3");
        System.out.println("\nJari-Jari Tabung: " + tabung.getJariJari() + " cm\u00B3");
        System.out.println("Tinggi Tabung: " + tabung.getTinggi() + " cm\u00B3");
        System.out.printf("Volume Tabung: %.0f", tabung.hitungVolume());
        System.out.println(" cm\u00B3");
        System.out.println("\nJari-Jari Kerucut: " + kerucut.getJariJari() + " cm\u00B3");
        System.out.println("Tinggi Kerucut: " + kerucut.getTinggi() + " cm\u00B3");
        System.out.printf("Volume Kerucut: %.0f", kerucut.hitungVolume()); 
        System.out.println(" cm\u00B3");
        
    }

}
