public class Main {
    public static void main(String[] args) {
        String[] kelimeArray = new String[5];
        kelimeArray[0] = "Testinium";
        kelimeArray[1] = "Java";
        kelimeArray[2] = "Array";
        kelimeArray[3] = "Programlama";
        kelimeArray[4] = "Yazılım";

        int arrayUzunlugu =
                kelimeArray.length;
        String ilkEleman = kelimeArray[0];
        String sonEleman =
                kelimeArray[arrayUzunlugu - 1];

        System.out.println("Array Uzunluğu: " + arrayUzunlugu);
        System.out.println("İlk Eleman: " + ilkEleman);
        System.out.println("Son Eleman: " + sonEleman);


    }

}