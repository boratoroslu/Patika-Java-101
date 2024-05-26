package matrisTranspozu;

import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrisin boyutlarını giriniz:");
        System.out.print("Satır sayısı (n): ");
        int n = scanner.nextInt();
        System.out.print("Sütun sayısı (m): ");
        int m = scanner.nextInt();

        int[][] matris = new int[n][m];

        // Kullanıcıdan matrisi al
        System.out.println("Matris elemanlarını giriniz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((i + 1) + ". satır, " + (j + 1) + ". sütun elemanı: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu al
        int[][] transpoz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpoz[i][j] = matris[j][i];
            }
        }

        // Matrisi ekrana yazdır
        System.out.println("Matris:");
        matrisiYazdir(matris);

        // Transpozu ekrana yazdır
        System.out.println("Transpoz:");
        matrisiYazdir(transpoz);
    }

    public static void matrisiYazdir(int[][] matris) {
        int n = matris.length;
        int m = matris[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
