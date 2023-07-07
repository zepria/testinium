import java.util.Random;
import java.util.Scanner;

public class sayi_tahmini2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomSayi = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        int tahminHakki = 3;
        String devamSecimi;

        System.out.println("Lütfen 1 ile 100 arasında bir sayı tahmin edin.");

        do {
            System.out.print("Lütfen bir tahminde bulunun: ");

            if (scanner.hasNextInt()) {
                int tahmin = scanner.nextInt();

                if (tahmin < 1 || tahmin > 100) {
                    System.out.println("Hatalı giriş. Sadece 1 ile 100 arasında tam sayılar kabul edilmektedir.");
                    continue;
                }

                if (tahmin == randomSayi) {
                    System.out.println("Tebrikler! Doğru tahmin ettiniz!");
                    break;
                } else {
                    tahminHakki--;
                    if (tahmin < randomSayi) {
                        System.out.println("Girilen sayı, random sayıdan daha küçük. Lütfen daha büyük bir sayı girin.");
                    } else {
                        System.out.println("Girilen sayı, random sayıdan daha büyük. Lütfen daha küçük bir sayı girin.");
                    }

                    if (tahminHakki > 0) {
                        System.out.println(tahminHakki + " hakkınız kaldı.");
                    } else {
                        System.out.print("Tahmin hakkınız tükendi. Random sayı: " + randomSayi + "\nTekrar oynamak ister misiniz? (Evet/Hayır): ");
                        devamSecimi = scanner.next();

                        if (devamSecimi.equalsIgnoreCase("Evet")) {
                            tahminHakki = 3;
                            randomSayi = random.nextInt(100) + 1;
                            System.out.println("1 ile 100 arasında bir sayı tahmin edin.");
                        } else {
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Hatalı giriş. Sadece 1 ile 100 arasında tam sayılar kabul edilmektedir.");
                scanner.next();
            }
        } while (true);
    }
}