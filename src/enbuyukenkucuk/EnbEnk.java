package enbuyukenkucuk;

import java.util.Scanner;

public class EnbEnk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        // Kullanıcıdan sayıları al
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numbers[i] = input.nextInt();
        }

        // En büyük ve en küçük sayıları bul
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Sonuçları ekrana yaz
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
