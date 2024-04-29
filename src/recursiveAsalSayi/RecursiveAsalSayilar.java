package recursiveAsalSayi;

import java.util.Scanner;

public class RecursiveAsalSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayınızı Giriniz..");
        int sayi = scanner.nextInt();
        if (asalMi(sayi))
            System.out.println(sayi + " sayısı ASALDIR !");
        else
            System.out.println(sayi + " sayısı ASAL değildir !");
    }
    static boolean asalMi(int sayi, int i) {
        if (i <= 1)
            return true;
        if (sayi % i == 0)
            return false;
        return asalMi(sayi, i - 1);
    }
    static boolean asalMi(int sayi) {
        return asalMi(sayi , sayi / 2);
    }
}

