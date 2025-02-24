import java.io.File;
import java.util.Scanner;

public class FilePermission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file or directory path: ");
        String path = sc.nextLine();
        File file = new File(path);
        if (file.exists()) {
            if (file.canRead()) {
                System.out.println("Read permission: Yes");
            } else {
                System.out.println("Read permission: No");
            }
            if (file.canWrite()) {
                System.out.println("Write permission: Yes");
            } else {
                System.out.println("Write permission: No");
            }
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
        sc.close();
    }
}
