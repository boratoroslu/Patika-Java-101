package ücgeninAlanı;

import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {

        int çevre;
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("X kenar uzunluğunu giriniz..");
        x = scanner.nextInt();
        System.out.println("Y kenar uzunluğunu giriniz..");
        y = scanner.nextInt();
        System.out.println("Z kenar uzunluğunu giriniz..");
        z = scanner.nextInt();

        çevre = x+y+z;
        int u = (x+y+z)/2;
        int alan =  u * (u - x)* (u - y) * (u - z);
        System.out.println("Üçgenin Çevresi: " + çevre);
        System.out.println("Üçgenin Alanı: " + alan);

    }
}
