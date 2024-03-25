package cinZodyagi;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int doğumTarihi,zodyak;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dogum yılınızı giriniz..");
        doğumTarihi = scanner.nextInt();
        if (doğumTarihi % 12 ==0){
            System.out.println("Maymun");
        } else if (doğumTarihi % 12 ==1) {
            System.out.println("Horoz");
        }else if (doğumTarihi % 12 ==2) {
            System.out.println("Köpek");
        }
        else if (doğumTarihi % 12 ==3) {
            System.out.println("Domuz");
        }
        else if (doğumTarihi % 12 ==4) {
            System.out.println("Fare");
        }
        else if (doğumTarihi % 12 ==5) {
            System.out.println("Öküz");
        }
        else if (doğumTarihi % 12 ==6) {
            System.out.println("Kaplan");
        }else if (doğumTarihi % 12 ==7) {
            System.out.println("Tavşan");
        }else if (doğumTarihi % 12 ==8) {
            System.out.println("Ejderha");
        }else if (doğumTarihi % 12 ==9) {
            System.out.println("Yılan");
        }else if (doğumTarihi % 12 ==10) {
            System.out.println("At");
        }else if (doğumTarihi % 12 ==11) {
            System.out.println("Koyun");
        }


    }
}
