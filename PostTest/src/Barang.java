public class Barang {
    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;
    private String kategori; // kata bang el ganti ke private

    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0;
        this.kategori = null; // kata bang el masukin ini juga
    }

    // getter
    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    // setter
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setStok(int stok) {
        if (stok < 0) {
            System.out.println("Stok sama sekali tidak boleh diset dengan angka negatif");
        } else {
            this.stok = stok;
        }
    }

    public void setHargaSatuan(double hargaSatuan) {
        if (hargaSatuan <= 0) {
            System.out.println("Harga satuan tidak boleh diset kurang dari atau sama dengan nol");
        } else {
            this.hargaSatuan = hargaSatuan;
        }
    }

    // fitur tambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("Jumlah stok harus lebih besar dari nol");
        }
    }

    // fitur kurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah > 0) {
            if (this.stok - jumlah >= 0) {
                this.stok -= jumlah;
            } else {
                System.out.println("Stok di gudang tidak cukup");
            }
        } else {
            System.out.println("Jumlah stok harus lebih besar dari nol");
        }
    }

    // getter setter kategori
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void tampilkanDetailBarang() {
        System.out.println("ID Barang: " + this.idBarang);
        System.out.println("Nama Barang: " + this.namaBarang);
        System.out.println("Kategori: " + this.kategori);
        System.out.println("Stok: " + this.stok);
        System.out.println("Harga Satuan: " + this.hargaSatuan);
    }
}
