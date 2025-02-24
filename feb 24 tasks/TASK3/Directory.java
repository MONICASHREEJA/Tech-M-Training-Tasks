import java.io.File;
import java.util.Scanner;

public class Directory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String path = sc.nextLine();
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            String[] fileList = directory.list();
            if (fileList != null && fileList.length > 0) {
                System.out.println("\nFiles and Directories in " + path + ":");
                for (String file : fileList) {
                    System.out.println(file);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path or directory does not exist.");
        }

        sc.close();
    }
}
