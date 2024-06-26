package Palindromik;

import java.util.Scanner;

public class PalindromeStrings {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;


        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir kelime girin : ");
        String str = input.nextLine();

        if (isPalindrome(str)) {
            System.out.println("palindromik.");
        } else
            System.out.println("palindromik değil.");

    }
}