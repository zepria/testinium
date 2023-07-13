import java.util.Scanner;

public class BasHarf {
    public static void main(String[] args) {
        String cumle = klavyedenCumleAl();
        String sonuc = basHarfiBuyukYap(cumle);
        System.out.println("Cümlenin yeni hali: " + sonuc);
    }

    public static String klavyedenCumleAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle girin: ");
        String cumle = scanner.nextLine();
        scanner.close();
        return cumle;
    }

    public static String basHarfiBuyukYap(String cumle) {
        StringBuilder sb = new StringBuilder();
        String[] kelimeler = cumle.split(" ");

        for (String kelime : kelimeler) {
            if (!kelime.isEmpty()) {
                char ilkHarf = Character.toUpperCase(kelime.charAt(0));
                String kalanKelime = kelime.substring(1);
                sb.append(ilkHarf).append(kalanKelime).append(" ");
            }
        }

        return sb.toString().trim();
    }
}