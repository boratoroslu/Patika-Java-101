package kullanicigirisi;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {

        String userName = "trbora22";
        String password = "boratoroslu123.";

        Scanner scanner = new Scanner(System.in);

        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("Kullanıcı adınızı giriniz:");
            String enteredUserName = scanner.nextLine();
            System.out.println("Şifrenizi giriniz:");
            String enteredPassword = scanner.nextLine();

            if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
                System.out.println("Giriş Yaptınız.");
                isLoggedIn = true;
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre.");

                System.out.println("Şifrenizi sıfırlamak ister misiniz? (evet/hayır):");
                String resetOption = scanner.nextLine();

                if (resetOption.equalsIgnoreCase("evet")) {
                    boolean isPasswordReset = false;
                    while (!isPasswordReset) {
                        System.out.println("Lütfen yeni şifrenizi giriniz:");
                        String newPassword = scanner.nextLine();

                        if (newPassword.equals(password)) {
                            System.out.println("Yeni şifre eski şifre ile aynı olamaz.");
                        } else {
                            password = newPassword;
                            System.out.println("Şifre oluşturuldu.");
                            isPasswordReset = true;
                        }
                    }
                }
            }
        }
    }
}
