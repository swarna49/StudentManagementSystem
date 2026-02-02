import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");

                System.out.print("Choose option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        manager.addStudent(new Student(id, name, age, course));
                        break;

                    case 2:
                        manager.viewStudents();
                        break;

                    case 3:
                        System.out.print("Enter ID: ");
                        int sid = sc.nextInt();
                        Student s = manager.searchStudent(sid);
                        if (s != null)
                            s.display();
                        else
                            System.out.println("Student not found.");
                        break;

                    case 4:
                        System.out.print("Enter ID to update: ");
                        int uid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new age: ");
                        int newAge = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new course: ");
                        String newCourse = sc.nextLine();
                        manager.updateStudent(uid, newName, newAge, newCourse);
                        break;

                    case 5:
                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();
                        manager.deleteStudent(did);
                        break;

                    case 6:
                        System.out.println("Thank you!");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
}
