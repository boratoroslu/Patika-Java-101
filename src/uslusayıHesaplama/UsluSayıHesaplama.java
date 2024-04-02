package uslusayıHesaplama;

import java.util.Scanner;

public class UsluSayıHesaplama {
    public static void main(String[] args) {

        int n,k;
        int total =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz..");
        n = scanner.nextInt();
        System.out.println("Üs olacak sayıyı giriniz..");
         k = scanner.nextInt();

         for (int i=1; i <=k; i++){
                    total *= n;


         }
        System.out.println(total);
    }
}
