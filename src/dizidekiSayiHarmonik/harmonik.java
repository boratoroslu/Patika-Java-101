package dizidekiSayiHarmonik;

public class harmonik {
    public static void main(String[] args) {
        // Test dizisi
        int[] dizi = {1, 2, 3, 4, 5};

        // Harmonik ortalamayı hesaplayalım
        double harmonicMean = calculateHarmonicMean(dizi);

        // Sonucu ekrana bastıralım
        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);

    }
    public static double calculateHarmonicMean(int[] dizi) {
        int n = dizi.length;
        double harmonicSum = 0.0;

        for (int i = 0; i < n; i++) {
            harmonicSum += 1.0 / dizi[i];
        }

        return n / harmonicSum;
    }
}
