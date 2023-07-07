public class Main {
    public static void main(String[] args) {
        String str = "Java, Python, C#, JavaScript, Angular";
        String[] array = str.split(", ");

        System.out.println("String: \"" + str + "\"");
        System.out.println();
        System.out.println("Array Uzunluğu: " + array.length);
        System.out.println();
        System.out.println("Bölünen Değerler:");

        for (String element : array) {
            System.out.println(element);
        }
    }
}