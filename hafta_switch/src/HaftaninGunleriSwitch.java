import java.util.Scanner;

public class HaftaninGunleriSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1-7 arasında bir rakam girin: ");
        int sayi = scanner.nextInt();

        String gun;
        switch (sayi) {
            case 1:
                gun = "Pazartesi";
                break;
            case 2:
                gun = "Salı";
                break;
            case 3:
                gun = "Çarşamba";
                break;
            case 4:
                gun = "Perşembe";
                break;
            case 5:
                gun = "Cuma";
                break;
            case 6:
                gun = "Cumartesi";
                break;
            case 7:
                gun = "Pazar";
                break;
            default:
                gun = null;
                break;
        }

        if (gun != null) {
            System.out.println("Girilen sayıya karşılık gelen gün: " + gun);
        } else {
            System.out.println("Hatalı girdi. Lütfen 1-7 arasında bir rakam girin.");
        }
    }
}