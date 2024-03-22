package manavKasaProgramı;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutkg = 2.14 , elmakg = 3.67 , domateskg = 1.11, muzkg = 0.95, patlıcankg =5.00;
        double toplam, armut, elma ,domates ,muz ,patlıcan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut kaç kilo?");
        armut = scanner.nextDouble() * armutkg;

        System.out.println("Elma kaç kilo?");
        elma = scanner.nextDouble() *elmakg;
        System.out.println("Domates kaç kilo?");
        domates = scanner.nextDouble() * domateskg;
        System.out.println("Muz kaç kilo?");
        muz = scanner.nextDouble() * muzkg;
        System.out.println("Patlıcan kaç kilo?");
        patlıcan = scanner.nextDouble() * patlıcankg;

        toplam = (armut + elma+domates+muz+patlıcan);
        System.out.println("Tutar: " + toplam +"TL");
    }
}
