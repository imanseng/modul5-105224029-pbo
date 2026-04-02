public class RekeningBank {
    private String noRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double getSaldo) {
        this.noRekening = nomorRekening;
        setSaldo(getSaldo);
    }

    public String getNoRekening() {
        return noRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru < 0) {
            System.out.println("Saldo yang dimasukkan tidak boleh negatif");
        } else {
            this.saldo = saldoBaru;
        }
    }

}
