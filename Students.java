// Parent class
class Student {
    String name;
    String email;
    double percentage;

    Student(String name, String email, double percentage) {
        this.name = name;
        this.email = email;
        this.percentage = percentage;
    }

    void getEligibility() {
        System.out.println("Eligibility check not specified for base class.");
    }
}

// Subclass for UG Student
class UGStudent extends Student {

    UGStudent(String name, String email, double percentage) {
        super(name, email, percentage);
    }

    @Override
    void getEligibility() {
        if (percentage >= 60) {
            System.out.println(name + " is eligible for UG admission.");
        } else {
            System.out.println(name + " is NOT eligible for UG admission.");
        }
    }
}

// Subclass for PG Student
class PGStudent extends Student {

    PGStudent(String name, String email, double percentage) {
        super(name, email, percentage);
    }

    @Override
    void getEligibility() {
        if (percentage >= 70) {
            System.out.println(name + " is eligible for PG admission.");
        } else {
            System.out.println(name + " is NOT eligible for PG admission.");
        }
    }
}

// Main 
public class Students {
    public static void main(String[] args) {
        UGStudent ug = new UGStudent("Ram", "Ram40@gmail.com", 65.5);
        PGStudent pg = new PGStudent("Nitin", "Nitin18@gmail.com", 68.0);

        ug.getEligibility();
        pg.getEligibility();
    }
}