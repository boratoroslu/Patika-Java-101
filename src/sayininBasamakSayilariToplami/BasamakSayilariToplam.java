package sayininBasamakSayilariToplami;

import java.util.Scanner;

public class BasamakSayilariToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int kalan;

        while (sayi > 0) {
            kalan = sayi % 10; // Sayının son basamağını alır
            toplam += kalan; // Son basamağı toplama ekler
            sayi /= 10; // Son basamağı sayıdan çıkarır
        }

        System.out.println("Basamakların toplamı: " + toplam);

        scanner.close();
    }
}
