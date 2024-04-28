package minMaxDegerBulma;

import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kacSayi;
        int sayi;
        System.out.println("Kaç tane sayı gireceksiniz? :");
        kacSayi = scan.nextInt();

        System.out.print("1. Sayınızı Giriniz: ");
        sayi = scan.nextInt();

        int max = sayi;
        int min = sayi;


        for (int i=2; i <= kacSayi; i++){
            System.out.println(i+". Sayınızı Giriniz..");
            sayi = scan.nextInt();
            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }


        }
        System.out.println("En Büyük Sayınız: "+max);
        System.out.println("En Küçük Sayınız: "+min);
        scan.close();

    }
}
