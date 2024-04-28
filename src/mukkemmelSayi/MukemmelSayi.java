package mukkemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi,toplam = 0;
        System.out.println("Lütfen bir sayi giriniz..");
        sayi = scanner.nextInt();
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
       if (toplam == sayi) {
           System.out.println(sayi +"Mükemmel sayıdır");
       }else {
           System.out.println(sayi +"Mükkemmel sayı değildir");
       }
    }
}
