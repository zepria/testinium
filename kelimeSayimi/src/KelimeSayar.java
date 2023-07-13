import java.util.Scanner;

public class KelimeSayar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen metni girin:");
        String input = scanner.nextLine();

        System.out.println("Lütfen aranacak kelimeyi girin:");
        String word = scanner.nextLine();

        int count = countOccurrences(input, word);

        System.out.println("Kelimenin geçtiği sayı: " + count);

        scanner.close();
    }

    public static int countOccurrences(String input, String word) {
        int count = 0;
        int index = 0;

        while (true) {
            index = input.indexOf(word, index);

            if (index != -1) {
                count++;
                index += word.length();
            } else {
                break;
            }
        }

        return count;
    }
}