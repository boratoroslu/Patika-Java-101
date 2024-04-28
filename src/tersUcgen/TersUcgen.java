package tersUcgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basamakSayisi;
        System.out.println("Lütfen bir sayi giriniz..");
        basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = 1; j <= basamakSayisi - i; j++) {

            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
