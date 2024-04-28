package elmas;

import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Lütfen sayınızı girinizz.");
        n = scanner.nextInt();

        for (int i =1; i<=6; i++){
            for (int k =1; k<=(n-i); k++){
                System.out.println(" ");
            }
            System.out.println(i);
        }
    }
}
