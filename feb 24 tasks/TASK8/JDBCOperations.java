import java.sql.*;
import java.util.Scanner;

public class JDBCOperations {
    static final String URL = "jdbc:mysql://localhost:3306/students";
    static final String USER = "root";
    static final String PASSWORD = "*********";

    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void insertRowsRecursively(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter student name (or type 'exit' to stop): ");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("exit")) return;

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("Row inserted successfully.");
        }

        insertRowsRecursively(conn, scanner);
    }

    public static void updateRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, id);
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println(rowsUpdated > 0 ? "Row updated successfully." : "ID not found.");
        }
    }

  
    public static void deleteRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        String sql = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            System.out.println(rowsDeleted > 0 ? "Row deleted successfully." : "ID not found.");
        }
    }

    
    public static void selectRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter student ID to view: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        String sql = "SELECT * FROM students WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age"));
            } else {
                System.out.println("No record found.");
            }
        }
    }

    public static void main(String[] args) {
        try (Connection conn = connect(); Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Insert a new Row");
                System.out.println("2. Update a Row");
                System.out.println("3. Delete a Row");
                System.out.println("4. Select a Row");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1 -> insertRowsRecursively(conn, scanner);
                    case 2 -> updateRow(conn, scanner);
                    case 3 -> deleteRow(conn, scanner);
                    case 4 -> selectRow(conn, scanner);
                    case 5 -> {
                        System.out.println("Exiting program...");
                        return;
                    }
                    default -> System.out.println("Invalid choice! Please enter again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
