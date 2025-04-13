package TugasPraktikum5;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main {

    public static String formatRupiah(int amount) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        DecimalFormat formatter = new DecimalFormat("Rp###,###", symbols);
        return formatter.format(amount);
    }

    public static void main(String[] args) {
        Scanner owd = new Scanner(System.in);

        System.out.println("=== CV. Labkomdas - Pembelian Jaket ===");
        System.out.print("Masukkan jumlah jaket A yang dibeli: ");
        int jumlahA = owd.nextInt();
        System.out.print("Masukkan jumlah jaket B yang dibeli: ");
        int jumlahB = owd.nextInt();
        System.out.print("Masukkan jumlah jaket C yang dibeli: ");
        int jumlahC = owd.nextInt();

        Jaket pesanan = new Jaket(jumlahA, jumlahB, jumlahC);

        System.out.println("\n========================= Pembelian =========================");
        System.out.printf("| %-10s | %-8s | %-15s | %-15s |\n", "Jenis", "Jumlah", "Harga Satuan", "Total Harga");
        System.out.println("+------------+----------+-----------------+-----------------+");
        System.out.printf("| %-10s | %-8d | %-15s | %-15s |\n",
                "Jaket A", pesanan.getJumlahA(), formatRupiah(pesanan.getHargaSatuanA()), formatRupiah(pesanan.hitungTotalHargaA()));
        System.out.printf("| %-10s | %-8d | %-15s | %-15s |\n",
                "Jaket B", pesanan.getJumlahB(), formatRupiah(pesanan.getHargaSatuanB()), formatRupiah(pesanan.hitungTotalHargaB()));
        System.out.printf("| %-10s | %-8d | %-15s | %-15s |\n",
                "Jaket C", pesanan.getJumlahC(), formatRupiah(pesanan.getHargaSatuanC()), formatRupiah(pesanan.hitungTotalHargaC()));
        System.out.println("+------------+----------+-----------------+-----------------+");
        System.out.printf("| %-10s   %-8s   %-15s | %-15s |\n", "", "", "TOTAL", formatRupiah(pesanan.hitungTotalHarga()));

        owd.close();
    }
}
