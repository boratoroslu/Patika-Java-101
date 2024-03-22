package taksimetreProgramı;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double kmTutar = 2.20 , total , startPrice=10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gideceğiniz mesafeyi KM cinsinden giriniz..");
        km = scanner.nextInt();

        total = (km * kmTutar);
        total += startPrice;
        System.out.println("Ödenecek Tutar: " + total +"TL");




    }
}
