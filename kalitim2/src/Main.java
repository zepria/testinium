class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String identificationNumber;

    public Person(String firstName, String lastName, int age, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.identificationNumber = identificationNumber;
    }

    public void print() {
        System.out.println("Adı: " + firstName);
        System.out.println("Soyadı: " + lastName);
        System.out.println("Yaş: " + age);
        System.out.println("Kimlik Numarası: " + identificationNumber);
    }
}

class Student extends Person {
    private double finalGradeAverage;

    // Constructor
    public Student(String firstName, String lastName, int age, String identificationNumber, double finalGradeAverage) {
        super(firstName, lastName, age, identificationNumber);
        this.finalGradeAverage = finalGradeAverage;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Dönem Sonu Not Ortalaması: " + finalGradeAverage);
    }
}

class Teacher extends Person {
    private String[] courseNames;
    private String department;

    public Teacher(String firstName, String lastName, int age, String identificationNumber, String[] courseNames, String department) {
        super(firstName, lastName, age, identificationNumber);
        this.courseNames = courseNames;
        this.department = department;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Verdiği Dersler: ");
        for (String course : courseNames) {
            System.out.println("- " + course);
        }
        System.out.println("Bölümü: " + department);
    }
}

class Staff extends Person {
    private String dutyArea;

    public Staff(String firstName, String lastName, int age, String identificationNumber, String dutyArea) {
        super(firstName, lastName, age, identificationNumber);
        this.dutyArea = dutyArea;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Görev Alanı: " + dutyArea);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Zeynep", "Ceyhan", 20, "510710521", 95.5);
        Teacher teacher = new Teacher("Sevde", "Kılıç", 24, "987654321", new String[]{"Java", "C#"}, "Bilgisayar Mühendisliği");
        Staff staff1 = new Staff("Deniz", "Ateş", 52, "123456789", "Bahçıvan");
        Staff staff2 = new Staff("Ali", "Veli", 44, "578497530", "Bina İçi Temizlik Görevlisi");
        Staff staff3 = new Staff("Ahmet", "Can", 37, "369054169", "Bakım/Onarım Görevlisi");


        student.print();
        System.out.println("--------------");
        teacher.print();
        System.out.println("--------------");
        staff1.print();
        System.out.println("--------------");
        staff2.print();
        System.out.println("--------------");
        staff3.print();
    }
}