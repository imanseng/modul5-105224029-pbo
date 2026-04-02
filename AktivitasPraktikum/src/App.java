public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Budi";
        // mhs.nim = "12345";

        System.out.println(mhs.nama);
        mhs.setNim("12345");
        System.out.println(mhs.getNim());
    }
}
