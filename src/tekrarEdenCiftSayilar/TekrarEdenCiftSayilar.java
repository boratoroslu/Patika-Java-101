package tekrarEdenCiftSayilar;

import java.util.HashSet;
import java.util.Set;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] dizi = {2, 4, 6, 2, 4, 8, 8, 10, 10, 10, 12, 14, 16, 16, 18, 20, 2};

        tekrarEdenCiftSayilariBul(dizi);
    }

    public static void tekrarEdenCiftSayilariBul(int[] dizi) {
        Set<Integer> gorulenSayilar = new HashSet<>();
        Set<Integer> tekrarEdenCiftler = new HashSet<>();

        for (int sayi : dizi) {
            if (sayi % 2 == 0) {
                if (gorulenSayilar.contains(sayi)) {
                    tekrarEdenCiftler.add(sayi);
                } else {
                    gorulenSayilar.add(sayi);
                }
            }
        }

        System.out.println("Tekrar eden çift sayılar: " + tekrarEdenCiftler);
    }
}
