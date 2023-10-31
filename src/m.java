
class Human {
    private String name;
    private int age;
    private String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}

class Student extends Human {
    private int rollNo;
    private String className;
    private int semester;
    private double cpi;

    public Student(String name, int age, String gender, int rollNo, String className, int semester, double cpi) {
        super(name, age, gender);
        this.rollNo = rollNo;
        this.className = className;
        this.semester = semester;
        this.cpi = cpi;
    }

    public String getInfo() {
        return "Name of student: " + getName() +
                "\nAge of student: " + getAge() +
                "\nGender of student: " + getGender() +
                "\nRoll number: " + rollNo +
                "\nClass: " + className +
                "\nSemester: " + semester +
                "\nCPI: " + cpi;
    }
}

class Faculty extends Human {
    private int empId;
    private int salary;
    private String specialization;

    public Faculty(String name, int age, String gender, int empId, int salary, String specialization) {
        super(name, age, gender);
        this.empId = empId;
        this.salary = salary;
        this.specialization = specialization;
    }

    public String getInfo() {
        return "Name of faculty: " + getName() +
                "\nAge of faculty: " + getAge() +
                "\nGender of faculty: " + getGender() +
                "\nEmployee ID: " + empId +
                "\nSalary: " + salary +
                "\nSpecialization: " + specialization;
    }

    public void setAge(int age) {
        // Set the age of the faculty member
        super.setAge(age);
    }
}

public class m {
    public static void main(String[] args) {
        Student s = new Student("Aditya", 18, "Male", 67, "Class IT", 3, 9.7);
        Faculty f = new Faculty("Dattatray Wavhal", 55, "Male", 221080067, 300000, "Physics");

        // Modify faculty's age using the setter
        f.setAge(56);

        System.out.println(s.getInfo());
        System.out.println(f.getInfo());
    }
}