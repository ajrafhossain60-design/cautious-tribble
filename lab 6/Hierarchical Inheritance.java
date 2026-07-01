class Person {
    void displayInfo() {
        System.out.println("This is a person.");
    }
}

class Doctor extends Person {
    void treatPatients() {
        System.out.println("Doctor treats patients.");
    }
}

class Teacher extends Person {
    void teachStudents() {
        System.out.println("Teacher teaches students.");
    }
}

class Engineer extends Person {
    void developSoftware() {
        System.out.println("Engineer develops software.");
    }
}

public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Engineer e = new Engineer();
        d.displayInfo();
        d.treatPatients();
        t.displayInfo();
        t.teachStudents();
        e.displayInfo();
        e.developSoftware();
    }
}
