package atmProjesi;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, password;
        int right =3;
        int balance = 1500;
        int select;

        Object test1 = null;
        Object test2;


        while (right >0){
            System.out.println("Kullanıcı adınız:");
            userName = scanner.nextLine();
            System.out.println("Parolanız:");
            password = scanner.nextLine();

            if (userName.equals("patika")&& password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-Para yatırma\n 2-Para Çekme\n 3-Bakiye Sorgula\n 4-ÇıkışYap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz..");
                    select = scanner.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Yatırılacak tutarı giriniz..");
                            int price = scanner.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.println("Çekilecek tutarı giriniz..");
                             price = scanner.nextInt();
                             if (balance>=price){
                                 balance -= price;
                             }
                             else {
                                 System.out.println("Bakiyeniz Yetersiz!!");
                             }
                             break;
                        case 3:
                            System.out.println("Bakiyeniz: "+ balance);
                            break;
                        case  4:
                            System.out.println("Tekrar Görüşmek Üzere..");
                            break;
                        default:
                            System.out.println("Hatalı Tuşlama Yaptınız. Lütfen Tekrar Deneyiniz..");
                    }
                } while (select !=4);
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar Deneyiniz..");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan Hakkınız:" +right);
                }
            }

        }


    }
}
