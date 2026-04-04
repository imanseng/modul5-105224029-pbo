public class Main {
    public static void main(String[] args) {
        // 1. Uji Kamar Pertama
        System.out.println("Uji Kamar 1:");
        KamarHotel kamar1 = new KamarHotel("A1", "Presidential", 4, -10000);
        kamar1.infoKamar();

        // 2. Uji Kamar Kedua
        System.out.println(" Uji Kamar 2:");
        KamarHotel kamar2 = new KamarHotel("A2", "Suite", 2);
        kamar2.setHargaPerMalam(100000); // Set harga manual karena awalnya 0
        
        kamar2.pesanKamar(4); // Coba pesan 4 orang (max 2)
        kamar2.pesanKamar(2); // Setelah itu, pesan kamar tersebut dengan jumlah tamu yang sesuai (misalnya 2 orang) 
        kamar2.pesanKamar(); // Cobalah lakukan pemesanan lagi tanpa parameter pesanKamar() pada kamar yang sama untuk melihat peringatan bahwa kamar tersebut sudah dipesan

        // Uji Penagihan
        System.out.println("Uji Penagihan:");
        // Demonstrasikan juga perhitungan tagihan pada kamar pertama untuk 2 malam menggunakan voucher "PROMO"
        System.out.println("Tagihan Kamar 1 (2 malam, PROMO):");
        double tagihanKamar1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total Bayar: Rp" + tagihanKamar1);

        // Hitung tagihan kamar kedua untuk 4 malam dengan voucher "PROMO"
        System.out.println("Tagihan Kamar 2 (4 malam, PROMO):");
        double tagihanKamar2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total Bayar: Rp" + tagihanKamar2);

        // Struk Akhir
        System.out.println("\n=== STRUK INFORMASI AKHIR ===");
        kamar1.infoKamar();
        kamar2.infoKamar();
    }
}
