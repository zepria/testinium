import java.util.Scanner;

class DortIslem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen birinci sayıyı giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        int sayi2 = scanner.nextInt();

                int toplama = sayi1 + sayi2;
                int çıkartma = sayi1 - sayi2;
                int çarpma = sayi1 * sayi2;
                double bölme = (double) sayi1 / sayi2;

           System.out.println("Toplama:" + toplama);
           System.out.println("Çıkartma:" + çıkartma);
           System.out.println("Çarpma:" + çarpma);
           System.out.println("Bölme:" + bölme);

        }
    }
