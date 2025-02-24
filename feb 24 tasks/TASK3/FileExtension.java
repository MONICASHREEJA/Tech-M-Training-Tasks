import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class FileExtension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String directoryPath = sc.nextLine();
        System.out.print("Enter the file extension (e.g., txt, jpg, pdf): ");
        String extension = sc.nextLine();
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            FilenameFilter filter = (dir, name) -> name.toLowerCase().endsWith("." + extension.toLowerCase());
            String[] fileList = directory.list(filter);
            if (fileList != null && fileList.length > 0) {
                System.out.println("\nFiles with extension ." + extension + " in " + directoryPath + ":");
                for (String file : fileList) {
                    System.out.println(file);
                }
            } else {
                System.out.println("No files found with ." + extension + " extension.");
            }
        } else {
            System.out.println("Invalid directory path or directory does not exist.");
        }
        sc.close();
    }
}
