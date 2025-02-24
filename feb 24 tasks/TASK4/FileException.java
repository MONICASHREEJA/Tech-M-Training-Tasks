import java.io.*;
import java.util.Scanner;

public class FileException {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("Error: File not found!");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String path = sc.nextLine();
        try {
            readFile(path);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
