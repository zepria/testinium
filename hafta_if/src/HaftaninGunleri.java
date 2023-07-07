import java.util.Scanner;

public class HaftaninGunleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1-7 arasında bir rakam girin: ");
        int sayi = scanner.nextInt();

        if (sayi >= 1 && sayi <= 7) {
            String gun;
            if (sayi == 1)
                gun = "Pazartesi";
            else if (sayi == 2)
                gun = "Salı";
            else if (sayi == 3)
                gun = "Çarşamba";
            else if (sayi == 4)
                gun = "Perşembe";
            else if (sayi == 5)
                gun = "Cuma";
            else if (sayi == 6)
                gun = "Cumartesi";
            else
                gun = "Pazar";

            System.out.println("Girilen sayıya karşılık gelen gün: " + gun);
        } else {
            System.out.println("Hatalı girdi. Lütfen 1-7 arasında bir rakam girin.");
        }
    }
}