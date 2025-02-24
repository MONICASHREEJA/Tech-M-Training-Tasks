import java.io.File;
import java.util.Scanner;

public class FileSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            long fileSizeBytes = file.length();
            double fileSizeKB = fileSizeBytes / 1024.0;
            double fileSizeMB = fileSizeKB / 1024.0;
            System.out.println("\nFile Size Details:");
            System.out.println("Size in Bytes: " + fileSizeBytes + " B");
            System.out.println("Size in KB: " + String.format("%.2f", fileSizeKB) + " KB");
            System.out.println("Size in MB: " + String.format("%.2f", fileSizeMB) + " MB");
        } else {
            System.out.println("The specified file does not exist.");
        }
        sc.close();
    }
}
