# Student Management System

A simple, console-based Java application to manage student records efficiently. This project demonstrates core Java concepts including OOP (Object-Oriented Programming), ArrayLists, and Scanner-based user interaction.

## 🚀 Features

- **Add Student**: Input ID, Name, Age, and Course to save a new student.
- **View Students**: List all registered students with their full details.
- **Search Student**: Find a specific student by their unique ID.
- **Update Student**: Modify existing student information (Name, Age, or Course).
- **Delete Student**: Remove a student record using their ID.
- **Persistent Logic**: Built using a robust `StudentManager` class to handle data operations.

## 📂 Project Structure

```text
StudentManagementSystem/
│
├── Student.java        # Data model representing a Student
├── StudentManager.java # Logic for managing the list of students
├── Main.java           # Entry point with the interactive menu
└── README.md           # Project documentation
```

## 🛠️ How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/swarna49/StudentManagementSystem.git
   ```
2. Navigate to the project folder:
   ```bash
   cd StudentManagementSystem
   ```
3. Compile the Java files:
   ```bash
   javac Student.java StudentManager.java Main.java
   ```
4. Run the application:
   ```bash
   java Main
   ```

## 🖥️ Usage

Follow the on-screen menu instructions once the application is running:
1. Select an option (1-6) from the menu.
2. Follow the prompts to enter data.
3. Choose "Exit" (Option 6) to close the program safely.

## 🤝 Contributing

Contributions are welcome! Feel free to fork the project and submit a Pull Request for any enhancements or bug fixes.
