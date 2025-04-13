package TugasPraktikum5;

public class Jaket {

    public static final int HARGA_JAKET_A = 100000;
    public static final int HARGA_JAKET_B = 125000;
    public static final int HARGA_JAKET_C = 175000;

    private int jumlahA;
    private int jumlahB;
    private int jumlahC;

    public Jaket(int jumlahA, int jumlahB, int jumlahC) {
        this.jumlahA = jumlahA;
        this.jumlahB = jumlahB;
        this.jumlahC = jumlahC;
    }

    public int getJumlahA() { return jumlahA; }
    public int getJumlahB() { return jumlahB; }
    public int getJumlahC() { return jumlahC; }

    public int getHargaSatuanA() {
        return (jumlahA > 100) ? 95000 : HARGA_JAKET_A;
    }

    public int getHargaSatuanB() {
        return (jumlahB > 100) ? 120000 : HARGA_JAKET_B;
    }

    public int getHargaSatuanC() {
        return (jumlahC > 100) ? 160000 : HARGA_JAKET_C;
    }

    public int hitungTotalHargaA() {
        return jumlahA * getHargaSatuanA();
    }

    public int hitungTotalHargaB() {
        return jumlahB * getHargaSatuanB();
    }

    public int hitungTotalHargaC() {
        return jumlahC * getHargaSatuanC();
    }

    public int hitungTotalHarga() {
        return hitungTotalHargaA() + hitungTotalHargaB() + hitungTotalHargaC();
    }

    public int hitungTotalHarga(String tipe) {
        switch (tipe.toUpperCase()) {
            case "A":
                return hitungTotalHargaA();
            case "B":
                return hitungTotalHargaB();
            case "C":
                return hitungTotalHargaC();
            default:
                System.out.println("Tipe jaket tidak dikenal: " + tipe);
                return 0;
        }
    }
}
