import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    // View Students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }

    // Search Student
    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    // Delete Student
    public void deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Update Student
    public void updateStudent(int id, String name, int age, String course) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
            s.setCourse(course);
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
