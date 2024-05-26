package dizidekielemanlarıngirilensayıdaküçük;

import java.util.Arrays;
import java.util.Scanner;

public class ddd {
    public static void main(String[] args) {
        // Test dizisi
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        // Kullanıcıdan sayı girmesini iste
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        // Girilen sayıdan küçük ve büyük en yakın sayıları bul
        Integer enKucukEnYakin = null;
        Integer enBuyukEnYakin = null;

        for (int eleman : dizi) {
            if (eleman < girilenSayi) {
                if (enKucukEnYakin == null || girilenSayi - eleman < girilenSayi - enKucukEnYakin) {
                    enKucukEnYakin = eleman;
                }
            } else if (eleman > girilenSayi) {
                if (enBuyukEnYakin == null || eleman - girilenSayi < enBuyukEnYakin - girilenSayi) {
                    enBuyukEnYakin = eleman;
                }
            }
        }

        // Sonuçları ekrana yazdır
        if (enKucukEnYakin != null) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukEnYakin);
        } else {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        }

        if (enBuyukEnYakin != null) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukEnYakin);
        } else {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        }
    }
}
