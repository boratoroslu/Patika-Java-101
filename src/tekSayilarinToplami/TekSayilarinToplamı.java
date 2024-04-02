package tekSayilarinToplami;

import java.util.Scanner;

public class TekSayilarinToplamı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        do {
            System.out.println("Sayı giriniz:");
            sayi = scanner.nextInt();
            if ( sayi % 4==0 && sayi % 2 ==0){
                toplam +=sayi;
            }

        }while (sayi %2==0);

        System.out.println(toplam);
        scanner.close();;
    }
}
