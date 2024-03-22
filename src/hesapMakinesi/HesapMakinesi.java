package hesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int sayi1, sayi2 , select;


        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayınızı giriniz..");
        sayi1 = scanner.nextInt();
        System.out.println("İkinci sayınızı giriniz..");
        sayi2 = scanner.nextInt();

        System.out.println("Lütfen yapmak istediğiniz işlemi tuşlayınız");
        System.out.println("Toplama:'1' , Çıkarma:'2' , Çarpma:'3' , Bölme:'4'");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuç: " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Sonuç: " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Sonuç: " + (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Sonuç: " + (sayi1/sayi2));
                break;
            default:
                System.out.println("Yanlış tuşlama yapıldı");
                break;
        }




    }
}
