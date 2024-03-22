package VucutKitle;

import java.util.Scanner;

public class vucutkitle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double boy , vki;
        int kilo;
        System.out.println("Lütfen Boyunuzu metre cinsinden giriniz.(1,72)");
        boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz..");
        kilo = scanner.nextInt();
        vki = kilo / (boy * boy);
        System.out.println("Boy:" +boy);
        System.out.println("Kilo: "+kilo);
        System.out.println("Vücut Kitle İndexi: "+vki);


    }
}
