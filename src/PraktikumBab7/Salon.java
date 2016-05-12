package PraktikumBab7;
public abstract class Salon {
    public String layanan;
    public String produk;
    public final int hairCut = 50000;
    public final int creamBath = 40000;
    public final int produkA = 15500;
    public final int produkB = 12000; 
    public abstract void Layanan(String layanan);
    public abstract void Produk(String produk); 
}
