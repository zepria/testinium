import java.util.Scanner;
import javax.swing.JOptionPane;

public class Kelime {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci kelimeyi girin: ");
        String kelime1 = scanner.nextLine();
        System.out.println("Birinci kelimenin uzunluğu:" + kelime1.length());
        String kelime2 = JOptionPane.showInputDialog("Lütfen ikinci kelimeyi girin:");
        System.out.println("İkinci kelimenin uzunluğu: " + kelime2.length());
    }
}