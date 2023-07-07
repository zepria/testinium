    import java.util.Scanner;
    import java.util.Random;


    public class sayi_tahmini {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int randomSayi = random.nextInt(100) + 1;

            System.out.println("Girdiğiniz değer 1'den küçük ve 100'den büyük olamaz.");

            for (int tahminHakki = 3; tahminHakki > 0; tahminHakki--) {
                System.out.print("Lütfen bir tahminde bulunun: ");
                if (scanner.hasNextInt()) {
                    int tahmin = scanner.nextInt();

                    if (tahmin < 1 || tahmin > 100) {
                        System.out.println("Hatalı giriş. Sadece 1 ile 100 arasında tam sayılar kabul edilmektedir.");
                        continue;
                    }

                    if (tahmin == randomSayi) {
                        System.out.println("Tebrikler! Doğru tahmin ettiniz!");
                        return;
                    } else {
                        if (tahmin < randomSayi) {
                            System.out.println("Girilen sayı, random sayıdan daha küçük. Lütfen daha büyük bir sayı girin.");
                        } else {
                            System.out.println("Girilen sayı, random sayıdan daha büyük. Lütfen daha küçük bir sayı girin.");
                        }

                        System.out.println("Yanlış tahmin. Tekrar deneyiniz. Kalan hak: " + (tahminHakki - 1));
                    }
                } else {
                    System.out.println("Hatalı giriş. Sadece 1 ile 100 arasında tam sayılar kabul edilmektedir.");
                    scanner.next();
                }
            }

            System.out.print("Tahmin hakkınız tükendi. Random sayı: " + randomSayi + "\nTekrar oynamak ister misiniz? (Evet/Hayır): ");
            String devamSecimi = scanner.next();

            if (devamSecimi.equalsIgnoreCase("Evet")) {
                main(null);
            } else {
                System.out.println("Oyun sonlandırıldı.");
            }
        }
    }
