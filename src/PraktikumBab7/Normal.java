package PraktikumBab7;
public class Normal extends Salon {
     @Override
    public void Layanan(String layanan) {
        if (layanan.equalsIgnoreCase("Haircut")){
            System.out.println("Layanan     : "+layanan);
            System.out.println("Harga       : Rp."+hairCut);
        }
        else if(layanan.equalsIgnoreCase("CreamBath")){
            System.out.println("Layanan     : "+layanan);
            System.out.println("Harga       : Rp."+creamBath);
        }
        else{
            System.out.println("Layanan Tidak Tersedia");
        }
    }
    @Override
    public void Produk(String produk){
        if (produk.equalsIgnoreCase("ProdukA")){
            System.out.println("Layanan     : "+produk);
            System.out.println("Harga       : Rp."+produkA);
        }
        else if(produk.equalsIgnoreCase("ProdukB")){
            System.out.println("Layanan     : "+produk);
            System.out.println("Harga       : Rp."+produkB);
        }
        else{
            System.out.println("Produk Tidak Tersedia");
        }
    }   
}
