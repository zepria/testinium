import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        int power = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, power);
            number /= 10;
        }

        return originalNumber == result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " Armstrong bir sayıdır.");
        } else {
            System.out.println(number + " Armstrong bir sayı değildir.");
        }
    }
}