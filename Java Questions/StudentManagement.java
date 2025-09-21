class Student {
    String name;
    int rollNumber;
    String grade;
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
    void updateGrade(String newGrade) {
        grade = newGrade;
        System.out.println("Grade updated to: " + grade);
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student("Aarav", 101, "B");
        student1.displayDetails();
        student1.updateGrade("A");
        student1.displayDetails();
    }
}