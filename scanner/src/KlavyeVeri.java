import java.util.Scanner;
import javax.swing.JOptionPane;

public class KlavyeVeri {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Lütfen birinci sayıyı klavyeden girin: ");
                int sayi1 = scanner.nextInt();

                System.out.print("Lütfen ikinci sayıyı klavyeden girin: ");
                int sayi2 = scanner.nextInt();

                int klavyeToplam = sayi1 + sayi2;
                System.out.println("Klavyeden girilen sayıların toplamı: " + klavyeToplam);

                String sayi1Str = JOptionPane.showInputDialog(null, "Birinci sayıyı dialog kutusuyla girin:");
                int sayi3 = Integer.parseInt(sayi1Str);

                String sayi2Str = JOptionPane.showInputDialog(null, "İkinci sayıyı dialog kutusuyla girin:");
                int sayi4 = Integer.parseInt(sayi2Str);

                int dialogToplam = sayi3 + sayi4;
                JOptionPane.showMessageDialog(null, "Dialog kutusundan girilen sayıların toplamı: " + dialogToplam);

                scanner.close();
        }
}