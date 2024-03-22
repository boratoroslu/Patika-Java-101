package notOrtalamasıHesaplama;

import java.util.Scanner;

public class NotOrtalamasıHesapla {
    public static void main(String[] args) {
    int matematik , fizik , türkçe , kimya , müzik , tarih;
    int ort;

    Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen matematik notunuzu giriniz..");
    matematik = scanner.nextInt();
        System.out.println("Lütfen fizik notunuzu giriniz..");
    fizik = scanner.nextInt();
        System.out.println("Lütfen türkçe notunuzu giriniz..");
    türkçe = scanner.nextInt();
        System.out.println("Lütfen kimya notunuzu giriniz..");
    kimya = scanner.nextInt();
        System.out.println("Lütfen müzik notunuzu giriniz..");
    müzik = scanner.nextInt();
        System.out.println("Lütfen tarih notunuzu giriniz..");
    tarih = scanner.nextInt();

    ort= (matematik+fizik+türkçe+kimya+müzik+tarih) / 6;
        System.out.println(ort);

        if (ort >= 50){
        System.out.println("Sınıfı Geçtiniz..");

    }
        else
    {
        System.out.println("Sınıfta Kaldınız..");
    }



}
}


