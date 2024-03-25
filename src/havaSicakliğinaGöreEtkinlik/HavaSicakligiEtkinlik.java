package havaSicakliğinaGöreEtkinlik;

import java.util.Scanner;

public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz:");
        heat = scanner.nextInt();

        if (heat < 5){
            System.out.println("Hava sıcaklığı Kayak yapmak için çok iyi görünüyor..");
        } else if (heat < 15) {

            System.out.println("Hava sıcaklığı Sinemaya gitmek için çok iyi görünüyor..");
        } else if (heat<25) {
            System.out.println("Hava sıcaklığı Piknik yapmak için çok iyi görünüyor..");
        } else if (heat>25) {
            System.out.println("Hava sıcaklığı Yüzmek için çok iyi görünüyor..");
        }



    }
}
