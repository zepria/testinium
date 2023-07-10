import java.util.Arrays;
import java.util.HashSet;

public class array3 {
    public static void main(String[] args) {
        int[] x = generateRandomArray(10);
        int[] y = generateRandomArray(10);

        System.out.println("x array’inde olup y array’inde olmayan elemanlar:");
        printArray(getDifference(x, y));

        System.out.println("y array’inde olup x array’inde olmayan elemanlar:");
        printArray(getDifference(y, x));

        System.out.println("İki array'de ortak olan elemanlar:");
        printArray(getIntersection(x, y));
    }


    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }


    public static int[] getDifference(int[] x, int[] y) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : y) {
            set.add(num);
        }
        int[] difference = new int[x.length];
        int index = 0;
        for (int num : x) {
            if (!set.contains(num)) {
                difference[index++] = num;
            }
        }
        return Arrays.copyOf(difference, index);
    }


    public static int[] getIntersection(int[] x, int[] y) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : x) {
            set.add(num);
        }
        int[] intersection = new int[y.length];
        int index = 0;
        for (int num : y) {
            if (set.contains(num)) {
                intersection[index++] = num;
            }
        }
        return Arrays.copyOf(intersection, index);
    }


    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}