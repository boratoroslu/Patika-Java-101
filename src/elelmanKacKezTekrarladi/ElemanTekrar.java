package elelmanKacKezTekrarladi;


import java.util.HashMap;

public class ElemanTekrar {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Frekansları hesapla
        HashMap<Integer, Integer> frekanslar = findFrequencies(dizi);

        // Sonuçları ekrana yazdır
        System.out.println("Tekrar Sayıları:");
        for (int eleman : frekanslar.keySet()) {
            int frekans = frekanslar.get(eleman);
            System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }

    public static HashMap<Integer, Integer> findFrequencies(int[] dizi) {
        HashMap<Integer, Integer> frekanslar = new HashMap<>();

        for (int eleman : dizi) {
            if (frekanslar.containsKey(eleman)) {
                // Eleman daha önce görüldüğünde, frekansı arttır
                frekanslar.put(eleman, frekanslar.get(eleman) + 1);
            } else {
                // Eleman ilk defa görülüyorsa, frekansı 1 olarak ekle
                frekanslar.put(eleman, 1);
            }
        }

        return frekanslar;
    }
}
