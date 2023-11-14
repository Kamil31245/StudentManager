import java.util.ArrayList;

public class StudentManager {
    public static ArrayList<Student> AllStudents = new ArrayList<Student>();
    public static void addStudent(int id, String name) {
        Student newStudent = new Student(id, name);
        AllStudents.add(newStudent);
        }
    public static void addGrade(int id, int grade) {
        for (Student student : AllStudents) {
            if (student.id == id) {
                int SizeOfGrades = student.grades.length;
                int[] TempGradesArray = new int[SizeOfGrades + 1];
                for (int i = 0; i < SizeOfGrades; i++) {
                    TempGradesArray[i] = student.grades[i];
                }
                TempGradesArray[SizeOfGrades] = grade;
                student.grades = TempGradesArray;
            }
        }
    }
    public static String getStudentData(int id) {
        for (Student student : AllStudents) {
            if (student.id == id) {
                String name = student.name;
                String grades = "Grades:\n";
                int NumOfGrades = student.grades.length;
                if (NumOfGrades == 0) {
                    grades = grades + "No grades found.";
                }
                else {
                    for (int i = 0; i < NumOfGrades; i++) {
                        String grade = Integer.toString(student.grades[i]);
                        grades = grades + grade + ", ";
                    }
                }
                return "Name: " + name + "\n" + grades;
            }
        }
        return "No student with id: " + id;
    }
}