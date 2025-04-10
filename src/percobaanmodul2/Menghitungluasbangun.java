package percobaanmodul2;

import javax.swing.JOptionPane;

public class Menghitungluasbangun {
    public double Luas_Persegi_panjang (int panjang, int lebar){
        return panjang * lebar;
    }
    public double Luas_Segitiga (int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }
    public double Luas_Lingkaran (int diameter) {
        int jari2 = diameter/2;
        return Math.PI * Math.pow(jari2, 2);
    } 
    
    public static void main(String[] args) {
        Menghitungluasbangun mt = new Menghitungluasbangun();
        
        String input = JOptionPane.showInputDialog("Pilih bangun datar :\n1. Persegi Panjang\n2. Segitiga\n3. Lingkaran");
        int pilihan = Integer.parseInt(input);
        double hasil = 0;
        
        switch (pilihan) {
            case 1 :
                int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang : "));
                int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar : "));
                hasil = mt.Luas_Persegi_panjang(panjang, lebar);
                JOptionPane.showInternalMessageDialog(null, "Luas Persegi Panjang = " + hasil);
                break;
            case 2 :
                int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alas : "));
                int tinggi =Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi : "));
                hasil = mt.Luas_Segitiga(alas, tinggi);
                JOptionPane.showInternalMessageDialog(null, "Luas Segitiga = " + hasil/2);
                break;
            case 3 :
                int diameter = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Diameter : "));
                hasil = mt.Luas_Lingkaran(diameter);
                JOptionPane.showInternalMessageDialog(null, "Luas Lingkaran : " + hasil);
                break;
                default:
                    JOptionPane.showInternalMessageDialog(null, "Pilihan Tidak Valid." + hasil);
                    System.exit(0);         
        }
    }
    
    
}
