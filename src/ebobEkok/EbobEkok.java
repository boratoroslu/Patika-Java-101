package ebobEkok;

import java.util.Scanner;

public class EbobEkok
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("İki sayı girin: ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int ebob = calculateEBOB(sayi1, sayi2);
        int ekok = calculateEKOK(sayi1, sayi2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }

    // EBOB hesaplama
    public static int calculateEBOB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // EKOK hesaplama
    public static int calculateEKOK(int a, int b) {
        return (a * b) / calculateEBOB(a, b);
    }
}
