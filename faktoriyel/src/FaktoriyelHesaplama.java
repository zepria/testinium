import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int sayi = scanner.nextInt();

        long faktoriyel = faktoriyelHesapla(sayi);
        System.out.println(sayi + " sayısının faktoriyeli: " + faktoriyel);
    }

    public static long faktoriyelHesapla(int sayi) {
        if (sayi < 0) {
            throw new IllegalArgumentException("Negatif sayıların faktoriyeli hesaplanamaz.");
        }

        long faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}