/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3;
import java.util.Scanner;
import tugaspertemuan3.ruang.Kerucut;
import tugaspertemuan3.ruang.Balok;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            int pilih;
            double panjang, lebar, tinggi, jariJari;
            Scanner input = new Scanner(System.in);

            System.out.println("INPUT");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. EXIT");
            System.out.print("PILIH : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("PANJANG : ");
                    panjang = input.nextInt();
                    System.out.print("LEBAR   : ");
                    lebar = input.nextInt();
                    System.out.print("TINGGI  : ");
                    tinggi = input.nextInt();
                    System.out.println("_________OUTPUT_________");
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    System.out.println("LUAS PERSEGI          : "+balok.luas());
                    System.out.println("KELILING PERSEGI      : "+balok.keliling());
                    System.out.println("VOLUME BALOK          : "+balok.volume());
                    System.out.println("LUAS PERMUKAAN BALOK  : "+balok.luasPermukaan());
                    break;


                case 2:
                    System.out.print("JARI-JARI : ");
                    jariJari = input.nextInt();
                    System.out.print("TINGGI   : ");
                    tinggi = input.nextInt();
                    System.out.println("_________OUTPUT_________");
                    Kerucut kerucut = new Kerucut(jariJari, tinggi);
                    System.out.println("LUAS LINGKARAN          : "+kerucut.luas());
                    System.out.println("KELILING LINGKARAN      : "+kerucut.keliling());
                    System.out.println("VOLUME KERUCUT          : "+kerucut.volume());
                    System.out.println("LUAS PERMUKAAN KERUCUT  : "+kerucut.luasPermukaan());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("YANG ANDA INPUTKAN SALAH");
                    break;
            }
        } while (true);
    }
    
}
