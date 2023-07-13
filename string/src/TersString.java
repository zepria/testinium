import java.util.Scanner;

public class TersString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin girin:");
        String input = scanner.nextLine();

        String reversedString = reverse(input);

        System.out.println("Tersten yazılmış hali:");
        System.out.println(reversedString);

        scanner.close();
    }

    public static String reverse(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }
}