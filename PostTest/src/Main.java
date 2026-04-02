public class Main {
    public static void main(String[] args) throws Exception {
        Barang barang = new Barang("B001", "Buku Tulis");
        // barang.stok = 50; ini gabisa karena atribut stok di private
        barang.tampilkanDetailBarang();
        barang.tambahStok(50);
        barang.setHargaSatuan(-999);
        barang.setKategori("ATK");
        barang.kurangiStok(51);
        barang.setHargaSatuan(5000);
        barang.tampilkanDetailBarang();

    }
}
