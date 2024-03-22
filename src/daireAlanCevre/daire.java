package daireAlanCevre;

import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r;
        double pi = 3.14;

        System.out.println("yarıçapı giriniz");
        r = scanner.nextInt();
        double alan = pi * r * r;
        System.out.println("Alan: " + alan);

        System.out.println("yarıçapı giriniz");
        r = scanner.nextInt();
        double cevre = 2 * pi *r;
        System.out.println("Çevre: " + cevre);

        double merkezaci;
        System.out.println("Merkez açısını giriniz..");
        merkezaci = scanner.nextInt();
        System.out.println("yarıçapı giriniz");
        r = scanner.nextInt();
        double daireDilimiAlan = (pi *(r*r)*merkezaci)/360;
        System.out.println("Daire diliminin alanı: " + daireDilimiAlan);



    }
}
