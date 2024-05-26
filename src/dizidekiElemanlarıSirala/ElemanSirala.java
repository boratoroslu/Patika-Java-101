package dizidekiElemanlarıSirala;

import java.util.Arrays;
import java.util.Scanner;

public class ElemanSirala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu al
        System.out.print("Dizinin boyutu n: ");
        int n = scanner.nextInt();

        // Diziyi oluştur
        int[] dizi = new int[n];

        // Kullanıcıdan dizinin elemanlarını al
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);

        // Sıralı diziyi ekrana yazdır
        System.out.print("Sıralama: ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
}
