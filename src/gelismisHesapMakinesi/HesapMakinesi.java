package gelismisHesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    static int toplama(int a , int b){
        int result=a+b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static  int cikarma(int a , int b){
        int result=a-b;
        System.out.println("Kalan: "+ result);
        return result;
    }
    static  int bolme(int a , int b){
        int result=a/b;
        System.out.println("Bölme Sonucu: "+ result);
        return result;
    }
    static  int carpma(int a , int b){
        int result=a*b;
        System.out.println("Carpma Sonucu: "+ result);
        return result;
    }
    static int us(int a, int b){
        int result=1;
        for (int i =1; i <=b; i++){
            result *= a;
        }
        System.out.println("Us Sonucu: "+ result);
        return result;
    }
    static int mod(int a, int b){
        int result=a%b;
        System.out.println("Mod Sonucu: "+ result);
        return result;
    }
    static void dikdortgen(int a, int b){
        System.out.println("Çevresi: " + (2 * (a+b)));
        System.out.println("Alanı: "+ (a * b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n"+
                "3-Çarpma İşlemi\n"+
                "4-Bölme İşlemi\n"+
                "5-Üslü Sayı Hesaplama\n"+
                "6-Mod Alma\n"+
                "7-Dikdörtgen Alan ve Çevre Hesabı"+
                "0-Çıkış Yap";

               while(true) {
                   System.out.println(menu);
                   System.out.println("Bir İşlem Seçiniz");
                   select = scanner.nextInt();
                   if (select ==0){
                       break;
                   }
                   System.out.println("İlk Sayıyı Giriniz");
                   int a = scanner.nextInt();
                   System.out.println("İkinci Sayıyı Giriniz");
                   int b = scanner.nextInt();
                   switch (select) {
                       case 1:
                             toplama(a , b);
                             break;
                       case 2:
                           cikarma(a, b);
                           break;
                       case 3:
                           bolme(a, b);
                           break;
                       case 4:
                           carpma(a,b);
                           break;
                       case 5:
                           us(a, b);
                           break;
                       case 6:
                           mod(a, b);
                           break;
                       case 7:
                           dikdortgen(a,b);
                           break;
                   }


    }
    }
}
