package PraktikumBab7;
public class Silver extends Salon {
    @Override
    public void Layanan(String layanan) {
        if (layanan.equalsIgnoreCase("Haircut")){
            int total = hairCut - (hairCut * 10 / 100);
            System.out.println("Layanan     : "+layanan);
            System.out.println("Harga Awal  : Rp."+hairCut);
            System.out.println("Discount    :  10%");
            System.out.println("Total       : Rp."+total);
        }
        else if(layanan.equalsIgnoreCase("CreamBath")){
            int total = creamBath - (creamBath * 10 / 100);
            System.out.println("Layanan     : "+layanan);
            System.out.println("Harga Awal  : Rp."+creamBath);
            System.out.println("Discount    :  10%");
            System.out.println("Total       : Rp."+total);
        }
        else{
            System.out.println("Layanan Tidak Tersedia");
        }
    }
    @Override
    public void Produk(String produk){
        if (produk.equalsIgnoreCase("ProdukA")){
            int total = produkA - (produkA * 10 / 100);
            System.out.println("Layanan     : "+produk);
            System.out.println("Harga Awal  : Rp."+produkA);
            System.out.println("Discount    :  10%");
            System.out.println("Total       : "+total);
        }
        else if(produk.equalsIgnoreCase("ProdukB")){
            int total = produkB -(produkB * 10 / 100);
            System.out.println("Layanan     : "+produk);
            System.out.println("Harga Awal  : Rp."+produkB);
            System.out.println("Discount    :  10%");
            System.out.println("Total       : Rp."+total);
        }
        else{
            System.out.println("Produk Tidak Tersedia");
        }
    }   
}
