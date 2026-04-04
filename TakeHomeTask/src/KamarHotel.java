public class KamarHotel {
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    // Constructor 1 Pendaftaran Kilat
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); // Menggunakan setter
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0; // sistem akan otomatis mengatur harga menjadi 0 
        this.isTersedia = true; // sistem akan otomatis mengatur status isTersedia menjadi true
    }

    // Constructor 2 Pendaftaran Lengkap
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); // Menggunakan setter
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam); // Menggunakan setter
        this.isTersedia = true; // status ketersediaan yang juga langsung diatur true secara bawaan
    }

    // Getter
    public String getNomorKamar() {
        return nomorKamar;
    }
    public String getTipeKamar() {
        return tipeKamar;
    }
    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }
    public double getHargaPerMalam() {
        return hargaPerMalam;
    }
    public boolean isTersedia() {
        return isTersedia;
    }

    // Setter
    public void setTipeKamar(String tipe) {
        if (tipe.equalsIgnoreCase("Reguler") || tipe.equalsIgnoreCase("Premium") || tipe.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipe;
        } else {
            System.out.println("[PERINGATAN] Tipe Kamar " + tipe + " tidak ada. Otomatis diatur ke: Reguler");
            this.tipeKamar = "Reguler";
        }
    }

    public void setHargaPerMalam(double harga) {
        if (harga < 50000) {
            System.out.println("[PERINGATAN] Harga Rp" + harga + " ditolak. Minimum diatur ke: Rp. 50000");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = harga;
        }
    }

    // Method Overloading: Pemesanan
    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("[BERHASIL] Kamar " + nomorKamar + " telah dipesan.");
        } else {
            System.out.println("[GAGAL] Kamar " + nomorKamar + " sudah terisi.");
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("[GAGAL] Kamar " + nomorKamar + " sudah terisi.");
        } else if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("[GAGAL] Kamar ini maksimal " + kapasitasMaksimal + " orang.");
        } else {
            isTersedia = false;
            System.out.println("[BERHASIL] Kamar " + nomorKamar + " dipesan untuk " + jumlahTamu + " tamu.");
        }
    }

    public void batalPesan() {
        isTersedia = true;
        System.out.println("[BERHASIL] Status Kamar " + nomorKamar + " kini Tersedia.");
    }

    // Method Overloading: Penagihan
    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double totalBayar = hitungTotalBayar(jumlahMalam);
        if (kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3) {
            System.out.println("[BERHASIL] Anda mendapatkan diskon 20%.");
            return totalBayar * 0.8;
        } else {
            System.out.println("[GAGAL] Syarat diskon tidak terpenuhi. Anda pakai harga normal.");
            return totalBayar;
        }
    }

    public void infoKamar() {
        System.out.println("-- PROFIL KAMAR --");
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Tipe: " + tipeKamar);
        System.out.println("Kapasitas Max: " + kapasitasMaksimal + " orang");
        System.out.println("Harga/Malam: Rp" + hargaPerMalam);
        System.out.println("Status: " + (isTersedia ? "Tersedia" : "Tidak Tersedia"));
    }
}
