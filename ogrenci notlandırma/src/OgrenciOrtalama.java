import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OgrenciOrtalama {

    public static void main(String[] args) {

        Map<String, Integer>
                ogrenciNotlari = new HashMap<>();
        ogrenciNotlari.put("510", 77);
        ogrenciNotlari.put("515", 45);
        ogrenciNotlari.put("520", 89);
        ogrenciNotlari.put("527", 95);
        ogrenciNotlari.put("538", 57);

        int minNot =
                Integer.MAX_VALUE;
        int maxNot =
                Integer.MIN_VALUE;
        int toplamNot = 0;

        for (Integer not :
                ogrenciNotlari.values()) {
            if (not < minNot) {
                minNot = not;
            }
            if (not > maxNot) {
                maxNot = not;
            }
            toplamNot += not;
        }
        double ortalamaNot = (double)
                toplamNot / ogrenciNotlari.size();

        System.out.println("Minimum Not: " + minNot);
        System.out.println("Maksimum Not: " + maxNot);
        System.out.println("Sınıf Ortalaması: " + ortalamaNot);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen silmek istediğiniz öğrencinin numarasını girin:");
        String silinecekOgrenciNo = scanner.nextLine();

        if (ogrenciNotlari.containsKey(silinecekOgrenciNo)) {
            ogrenciNotlari.remove(silinecekOgrenciNo);
            System.out.println("Öğrenci silindi: " + silinecekOgrenciNo);
        } else {
            System.out.println("Girilen numaraya sahip bir öğrenci yok.");
        }


    }

}
