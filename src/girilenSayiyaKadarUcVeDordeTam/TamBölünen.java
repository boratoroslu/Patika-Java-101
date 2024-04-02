package girilenSayiyaKadarUcVeDordeTam;

import java.util.Scanner;

public class TamBölünen {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int sayi =0;
        System.out.println("Sayıyı giriniz..");
        sayi = scanner.nextInt();

        int sayac = 0;
        int toplam = 0;


        for (int i =0; i<=sayi; i++ ){
                if (i %3 == 0 && i % 4==0){
                    sayac++;
                    toplam += i;
                }
        }
          if (sayac >0){
             double ort = (double) toplam / sayac;
              System.out.println("0'dan"+ sayi+ "'e kadar olan 3'e ve 4'e tam bölünen sayıların ortalaması:"+ort);
          }
          else {
              System.out.println("Sayı aralığında 3'e ve 4'e bölünen yoktur..");
          }
              scanner.close();
    }

}
