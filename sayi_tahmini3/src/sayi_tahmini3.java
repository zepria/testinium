import java.util.Random;
import java.util.Scanner;

public class sayi_tahmini3 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomSayi = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        int tahminHakki = 3;
        while (tahminHakki > 0) {
            System.out.print("Lütfen Bir Tahminde Bulunun (1-100 arası tam sayı): ");
            if (scanner.hasNextInt()) {
                int tahmin = scanner.nextInt();
                if (tahmin >= 1 && tahmin <= 100) {
                    if (tahmin == randomSayi) {
                        System.out.println("Tebrikler! Doğru Tahmin Ettiniz!");
                        return;
                    } else {
                        tahminHakki--;
                        System.out.println("Hatalı Tahmin.");

                        if (tahmin < randomSayi) {
                            System.out.println("Girilen sayı, random sayıdan daha küçük. Lütfen daha büyük bir sayı girin.");
                        } else {
                            System.out.println("Girilen sayı, random sayıdan daha büyük. Lütfen daha küçük bir sayı girin.");
                        }

                        System.out.println(tahminHakki + " hakkınız kaldı.");
                    }
                } else {
                    System.out.println("Hatalı giriş. Girilen sayı 1'den küçük veya 100'den büyük olamaz.");
                }
            } else {
                System.out.println("Hatalı giriş. Sadece tam sayılar kabul edilmektedir.");
                scanner.next();
            }
        }

        System.out.println("Tahmin Hakkınız Tükendi. Random Sayı: " + randomSayi);

        System.out.print("Tekrar oynamak ister misiniz? (evet/hayır): ");
        String cevap = scanner.next();
        if (cevap.equalsIgnoreCase("evet")) {
            main(null);
        } else {
            System.out.println("Oyun sonlandırıldı.");
        }
    }
}