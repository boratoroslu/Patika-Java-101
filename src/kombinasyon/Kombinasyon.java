package kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        // n'in faktöriyelini hesapla
        long nFaktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }

        // r'nin faktöriyelini hesapla
        long rFaktoriyel = 1;
        for (int i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }

        // (n-r)'nin faktöriyelini hesapla
        int nMinusR = n - r;
        long nMinusRFaktoriyel = 1;
        for (int i = 1; i <= nMinusR; i++) {
            nMinusRFaktoriyel *= i;
        }

        // Kombinasyonu hesapla
        long kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);

        scanner.close();
    }
}
