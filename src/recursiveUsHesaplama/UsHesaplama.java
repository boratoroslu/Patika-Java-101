package recursiveUsHesaplama;

import java.util.Scanner;

public class UsHesaplama {
    // Recursive metot
    public static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usAlma(taban, us - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini alma
        System.out.print("Taban değeri giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        // Üs alma işlemini yapma ve sonucu ekrana yazdırma
        int sonuc = usAlma(taban, us);
        System.out.println("Sonuç: " + sonuc);

    }
}
