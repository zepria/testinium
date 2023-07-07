
public class Main {
    public static void main(String[] args) {
        int intSayi1 = 10;
        int intSayi2 = 27;
        long longSayi = 123456789510510510L;
        short shortSayi = 510;
        byte byteSayi = -117;
        double ondalikliSayi = 3.14;
        float floatSayi = 510.510f;
        char karakter = 'Z';
        boolean booleanDegisken = true;

        System.out.println("intSayi1: " + intSayi1);
        System.out.println("longSayi: " + longSayi);
        System.out.println("shortSayi: " + shortSayi);
        System.out.println("byteSayi: " + byteSayi);
        System.out.println("ondalikliSayi: " + ondalikliSayi);
        System.out.println("floatSayi: " + floatSayi);
        System.out.println("karakter: " + karakter);
        System.out.println("booleanDegisken: " + booleanDegisken);

        int toplamaSonuc = toplama(intSayi1, intSayi2);
        System.out.println("Toplama Sonuc: " + toplamaSonuc);
        int cikarmaSonuc = cikarma(intSayi1, intSayi2);
        System.out.println("Çıkarma Sonuc: " + cikarmaSonuc);
        int carpmaSonuc = carpma(intSayi1, intSayi2);
        System.out.println("Çarpma Sonuc: " + carpmaSonuc);
        double bolmeSonuc = bolme(intSayi1, intSayi2);
        System.out.println("Bölme Sonuc: " + bolmeSonuc);
    }

    public static int toplama(int intSayi1, int intSayi2) {
        return intSayi1 + intSayi2;
    }

    public static int cikarma(int intSayi1, int intSayi2) {
        return intSayi1 - intSayi2;
    }

    public static int carpma(int intSayi1, int intSayi2) {
        return intSayi1 * intSayi2;
    }

    public static double bolme(int intSayi1, int intSayi2) {
        return (double) intSayi1 / intSayi2;
    }
}






