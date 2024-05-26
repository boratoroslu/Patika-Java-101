package yildizlarB;

public class yildizlar {
    public static void main(String[] args) {
        // 'B' harfi için çok boyutlu dizi tanımlama
        char[][] letterB = {
                {'*', '*', '*', ' ', ' '},
                {'*', ' ', ' ', '*', ' '},
                {'*', ' ', ' ', '*', ' '},
                {'*', '*', '*', ' ', ' '},
                {'*', ' ', ' ', '*', ' '},
                {'*', ' ', ' ', '*', ' '},
                {'*', '*', '*', ' ', ' '},
        };

        // Diziyi ekrana yazdırma
        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                System.out.print(letterB[i][j]);
            }
            System.out.println();
        }
    }
}
