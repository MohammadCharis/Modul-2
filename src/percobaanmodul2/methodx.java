package percobaanmodul2;

import java.util.Scanner;

public class methodx {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2,2);
        return luas;
    }
    public double volume_tabung (int diameter, int tinggi) {
        double Luas_alas = luas_lingkaran(diameter);
        return Luas_alas * tinggi;
    }
    public double volume_kerucut (int diameter, int tinggi) {
        double Luas_alas = luas_lingkaran(diameter);
        return (1.0/3.0) * Luas_alas * tinggi;
    }
    public double volume_bola (int diameter) {
        int jari2 = diameter/2;
        return (4.0/3.0) * Math.PI * Math.pow(jari2, 3);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        methodx mt = new methodx();
        
        try {
        System.out.print("Masukkan Diameter : ");
        int diameter = input.nextInt();
        System.out.print("Masukkan tinggi untuk tabung / kerucut : ");
        int tinggi = input.nextInt();
        System.out.println("Luas Lingkaran = " + mt.luas_lingkaran(diameter));
        System.out.println("Volume Tabung = " + mt.volume_tabung(diameter, tinggi));
        System.out.println("Volume Kerucut = " + mt.volume_kerucut(diameter, tinggi));
        System.out.println("Volume Bola = " + mt.volume_bola(diameter));
        System.exit(0);    
        } catch (Exception e) {
            System.out.println("Inputan Tidak Valid, Harap Masukkan Angka Bulat.");
        } finally {
            input.close();
        }
        
    }
    
}
