package polidromSayi;

import java.util.Scanner;

public class Polidrom {
    // Bir sayının palindrom olup olmadığını kontrol eden metot
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        // Sayıyı ters çevir
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        // Ters çevrilmiş sayı ile orijinal sayıyı karşılaştır
        if (originalNumber == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Kullanıcıdan bir sayı girişi al
            System.out.print("Bir sayı girin: ");
            int num = scanner.nextInt();

            // Palindrom kontrolü yap
            if (isPalindrome(num)) {
                System.out.println(num + " bir palindrom sayıdır.");
            } else {
                System.out.println(num + " bir palindrom sayı değildir.");
            }
        } catch (Exception e) {
            System.out.println("Lütfen geçerli bir sayı girin.");
        } finally {
            scanner.close();
        }
    }
}
