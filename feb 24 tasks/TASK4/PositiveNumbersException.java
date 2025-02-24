import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PositiveNumbersException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();
        try {
            Scanner fileScanner = new Scanner(new File(path));
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                if (num > 0) {
                    throw new Exception("Error: Positive number found - " + num);
                }
                System.out.println("Number: " + num);
            }
            System.out.println("All numbers are negative or zero.");
            fileScanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
