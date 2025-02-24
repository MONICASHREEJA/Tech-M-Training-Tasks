import java.io.File;
import java.util.Scanner;

public class PathNameCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pathname: ");
        String path = sc.nextLine();
        File file = new File(path);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The given pathname is a file.");
            } else if (file.isDirectory()) {
                System.out.println("The given pathname is a directory.");
            }
        } else {
            System.out.println("The specified pathname does not exist.");
        }
        sc.close();
    }
}
