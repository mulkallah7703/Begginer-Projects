package programmingIIlap;
class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public Student(int id, double gpa) {
        this(id, "", gpa);
    }

    public String getName() { return name; }
    public int getId() { return id; } 
    public double getGPA() { return gpa; }
    public void setName(String newName) { this.name = newName; } 

    public String toString() {
        return "Student: \n\tID: " + id + "\n\tName: " + name + "\n\tGPA: " + gpa;
    }
}

class Undergrad extends Student {
    private String year;

    public Undergrad(int id, String name, double gpa, String year) {
        super(id, name, gpa);
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String newYear) {
        this.year = newYear;
    }

    public String toString() {
        return "Undergraduate " + super.toString() + "\n\tYear: " + year;
    }
}

class Graduate extends Student {
    private String thesisTitle;

    public Graduate(int id, String name, double gpa, String thesisTitle) {
        super(id, name, gpa);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String newThesisTitle) {
        this.thesisTitle = newThesisTitle;
    }

    public String toString() {
        return "Graduate " + super.toString() + "\n\tThesis: " + thesisTitle;
    }
}

// Test class should be public because it contains the main method
public class TestStudents {
    public static void main(String[] args) {
        Student s1 = new Student(97000, "Sameer", 3.51);
        Student s2 = new Student(98000, 3.22);
        Undergrad u1 = new Undergrad(99000, "Shahid", 2.91, "Junior");
        Graduate g1 = new Graduate(200000, "Mubin", 3.57, "Algorithms & Complexity");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(u1);
        System.out.println(g1);
       
    }
}


