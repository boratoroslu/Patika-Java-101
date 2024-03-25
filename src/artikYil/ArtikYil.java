package artikYil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean artikYil =  false;
        System.out.println("Yılı giriniz..");
        year = scanner.nextInt();
          if (year %4 ==0){
              if (year % 100 ==0){
                  if (year % 400 ==0){
                 artikYil = true;
                  }
              } else {
                  artikYil = true;
              }
          }

                 if (artikYil){
                     System.out.println(year + "bir artık yıldır.");
                 }
                 else {
                     System.out.println(year +"bir artık yıl değildir.");
                 }
    }
}
