import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmptyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();
        try {
            File file = new File(path);
            if (!file.exists() || !file.isFile()) {
                throw new FileNotFoundException("Error: File not found.");
            }
            if (file.length() == 0) {
                throw new Exception("Error: The file is empty.");
            }
            // Read and display file content
            Scanner fileScanner = new Scanner(file);
            System.out.println("\nFile Content:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
