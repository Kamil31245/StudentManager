public class Main {
    public static void main(String[] args) {
    StudentManager.addStudent(1, "Kamil");
    StudentManager.addStudent(2, "Olek");
    StudentManager.addStudent(3, "Karol");
    StudentManager.addGrade(1, 5);
    StudentManager.addGrade(2, 6);
    StudentManager.addGrade(3, 4);
    StudentManager.addGrade(3, 3);
    System.out.println(StudentManager.getStudentData(3));
    }
}