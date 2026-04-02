// Soal No 1
public class Karyawan {
    private String idKaryawan; // Soal No 1
    private String nama; // Soal No 1
    private double gajiPokok; // Soal No 2
    private String departemen; // Soal No 3 (katanya protected ganti private)

    // Soal No 1
    public Karyawan(String idKaryawan, String nama) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
    }

    // Soal No 1
    public String getIdKaryawan() {
        return idKaryawan;
    }

    // Soal No 1
    public String getNama() {
        return nama;
    }

    // Soal No 1
    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    // Soal No 1
    public void setNama(String nama) {
        this.nama = nama;
    }

        // Soal No 2
    public double getGajiPokok() {
        return gajiPokok;
    }

    // Soal No 2
    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok < 0) {
            System.out.println("Gaji tidak boleh kurang dari nol");
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    // Soal No 3 (getter sama setter kubuat jg)
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // Soal No 3
    public void tampilkanDataKaryawan() {
        System.out.println("ID Karyawan: " + this.idKaryawan);
        System.out.println("Nama: " + this.nama);
        System.out.println("Gaji Pokok: " + this.gajiPokok);
        System.out.println("Departemen: " + this.departemen);
    }
}
