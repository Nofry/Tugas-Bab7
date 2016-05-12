package PraktikumBab7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String layanan, produk;
        System.out.println("Jenis Keanggotaan: ");
        System.out.println("1. Premium");
        System.out.println("2. Golden");
        System.out.println("3. Silver");
        System.out.println("4. Normal");
        System.out.print("Pilih: ");
        int pilih = in.nextInt();
        switch(pilih){
            case 1 : System.out.print("Masukkan Layanan: ");
                     layanan = in.next();
                     System.out.print("Masukkan Produk : ");
                     produk = in.next();
                     Premium a = new Premium();
                     a.Layanan(layanan);
                     System.out.println("=======================");
                     a.Produk(produk);
                     break;
            case 2 : System.out.print("Masukkan Layanan: ");
                     layanan = in.next();
                     System.out.print("Masukkan Produk : ");
                     produk = in.next();
                     Gold b = new Gold();
                     b.Layanan(layanan);
                     System.out.println("=======================");
                     b.Produk(produk);
                     break;
            case 3 : System.out.print("Masukkan Layanan: ");
                     layanan = in.next();
                     System.out.print("Masukkan Produk : ");
                     produk = in.next();
                     Silver c = new Silver();
                     c.Layanan(layanan);
                     System.out.println("=======================");
                     c.Produk(produk);
                     break;
            case 4 : System.out.print("Masukkan Layanan: ");
                     layanan = in.next();
                     System.out.print("Masukkan Produk : ");
                     produk = in.next();
                     Normal d = new Normal();
                     d.Layanan(layanan);
                     System.out.println("=======================");
                     d.Produk(produk);
                     break;
            default : System.out.println("Pilihan Tidak Valid");
        }
    }
}
