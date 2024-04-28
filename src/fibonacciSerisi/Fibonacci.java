package fibonacciSerisi;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman Sayısı: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Serisi: ");
        System.out.print(a + " " + b + " ");

        for (int i = 1; i < n; i++) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }
}
