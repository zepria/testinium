public class Ogrenci {
    private final String ad;
    private final String soyad;
    private String okulNo;
    private String sinif;
    private Integer not1;
    private Integer not2;
    private Integer not3;

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(String okulNo) {
        this.okulNo = okulNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public Integer getNot1() {
        return not1;
    }

    public Integer getNot2() {
        return not2;
    }

    public Integer getNot3() {
        return not3;
    }

    public void setNot(Integer not1) {
        this.not1 = not1;
    }

    public void setNot(Integer not1, Integer not2) {
        this.not1 = not1;
        this.not2 = not2;
    }

    public void setNot(Integer not1, Integer not2, Integer not3) {
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
    }

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Zeynep", "Ceyhan");
        ogrenci.setOkulNo("784578");
        ogrenci.setSinif("11-D");
        ogrenci.setNot(57);
        ogrenci.setNot(77, 93);
        ogrenci.setNot(67, 82, 76);

        System.out.println(ogrenci.getAd() + " " + ogrenci.getSoyad() + ", Okul No: " + ogrenci.getOkulNo() + ", Sınıf: " + ogrenci.getSinif());
        System.out.println("Notlar: Not1: " + ogrenci.getNot1() + ", Not2: " + ogrenci.getNot2() + ", Not3: " + ogrenci.getNot3());
    }
}