import java.io.File;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class LastModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            // Get last modified date
            long lastModified = file.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String formattedDate = sdf.format(new Date(lastModified));
            System.out.println("Last modified date: " + formattedDate);
        } else {
            System.out.println("The specified file does NOT exist.");
        }
        sc.close();
    }
}
