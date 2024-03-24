package sinifGecmeDurumu;

import java.util.Scanner;

public class SinifGeçme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplamNot = 0;
        int gecerliDersSayisi = 5; // Toplam ders sayısı

        // Matematik dersi notunu al
        System.out.print("Matematik notunu giriniz: ");
        int matematikNot = scanner.nextInt();
        if (matematikNot >= 0 && matematikNot <= 100) {
            toplamNot += matematikNot;
        } else {
            matematikNot = 0; // 0 ile 100 arasında değilse, notu 0 olarak hesaba kat.
        }

        // Fizik dersi notunu al
        System.out.print("Fizik notunu giriniz: ");
        int fizikNot = scanner.nextInt();
        if (fizikNot >= 0 && fizikNot <= 100) {
            toplamNot += fizikNot;
        } else {
            fizikNot = 0;
        }

        // Kimya dersi notunu al
        System.out.print("Kimya notunu giriniz: ");
        int kimyaNot = scanner.nextInt();
        if (kimyaNot >= 0 && kimyaNot <= 100) {
            toplamNot += kimyaNot;
        } else {
            kimyaNot = 0;
        }

        // Tarih dersi notunu al
        System.out.print("Tarih notunu giriniz: ");
        int tarihNot = scanner.nextInt();
        if (tarihNot >= 0 && tarihNot <= 100) {
            toplamNot += tarihNot;
        } else {
            tarihNot = 0;
        }

        // Müzik dersi notunu al
        System.out.print("Müzik notunu giriniz: ");
        int muzikNot = scanner.nextInt();
        if (muzikNot >= 0 && muzikNot <= 100) {
            toplamNot += muzikNot;
        } else {
            muzikNot = 0;
        }

        // Ortalamayı hesapla
        double ortalama = toplamNot / 5.0;

        // Sınıfı geçme durumunu kontrol et
        if (ortalama >= 55) {
            System.out.println("Ortalama: " + ortalama + " - Sınıfı geçtiniz!");
        } else {
            System.out.println("Ortalama: " + ortalama + " - Sınıfta kaldınız.");
        }

        scanner.close();
    }
}

