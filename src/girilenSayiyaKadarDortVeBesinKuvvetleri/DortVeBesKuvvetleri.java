package girilenSayiyaKadarDortVeBesinKuvvetleri;

import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Sayınızı Giriniz:");
        sayi = scanner.nextInt();
        for (int i =1; i<=sayi; i++){
            int üst4 = 1;
            int üst5 =1;
                 for (int j =0; j<i; j++){
                     üst4 *=4;
                     üst5 *=5;
                 }
            System.out.println("4^"+i+"="+üst4);
            System.out.println("5^"+i+"="+üst5);
        }
    }
}
