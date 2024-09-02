class Student {
    private String bogsnyawfirstname;
    private String bogsnyawlastname;

    public Student(String bogsnyawfirstname, String bogsnyawlastname) {
        this.bogsnyawfirstname = bogsnyawfirstname;
        this.bogsnyawlastname = bogsnyawlastname;
    }

    public void printFullName() {
        System.out.println(bogsnyawfirstname + " " + bogsnyawlastname);
    }
}

public class tasksheet122 {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Rexs", "Gonzales"),
            new Student("Norman", "Garbo"),
            new Student("Jonas", "Limson"),
        };
        for (Student s : students) {
            s.printFullName();
        }
    }
}
