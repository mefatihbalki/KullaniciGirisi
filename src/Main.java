import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, select, newpassword = new String();

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        username = input.nextLine();

        System.out.print("Şifre: ");
        password = input.nextLine();
//Sorunsuz Giriş Bölümü
        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yapıldı!");
        } else {
            System.out.println("Hatalı Giriş Yaptınız!");
        }
//Şifre Uyuşmadığında devreye girecek bölüm
        if (!password.equals("java123")) System.out.println("Şifrenizi Değiştirmek ister misiniz?");
//Kullanıcı Seçimi
        System.out.println("Evet\nHayır");
        System.out.println("Seçiminiz: ");
        select = input.nextLine();
//Swtich-Case Yapısı
        switch (select) {
            case "Evet":
                System.out.println("Yeni Şifenizi Giriniz");
                newpassword = input.nextLine();

                if (!password.equals(newpassword)) {
                    System.out.println("Şifre Değiştirildi");
                } else {
                    System.out.println("Yeni Şifreniz Daha Önce Kullandığınız Bir Şifre Olamaz!");
                }
//Şifre Oluşturma Bölümü
                if (newpassword.equals("fatih123"))
                    System.out.println("Giriş Yapıldı");
                break;

            case "Hayır":
                System.out.println("Şifrenizi Tekrar Giriniz:");
                break;
//Program Bitişi
        }
    }
}
