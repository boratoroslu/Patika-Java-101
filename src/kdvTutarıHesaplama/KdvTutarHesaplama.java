package kdvTutarıHesaplama;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
* */

public class KdvTutarHesaplama {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double tutar, kdvTutar , kdvliTutar , kdvOran;

        System.out.println("Tutarı Giriniz..");
        tutar = scanner.nextDouble();


      if (tutar > 0 && tutar < 1000){

         kdvOran = 0.18;
      }
      else {
          kdvOran = 0.08;

      }

      kdvTutar = tutar * kdvOran;
      kdvliTutar = tutar + kdvTutar;
        System.out.println(kdvliTutar);
}
}
