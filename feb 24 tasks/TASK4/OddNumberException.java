import java.util.*;
public class OddNumberException {
    public static void checkNumber(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Number is odd");
        }
        System.out.println("Number is even.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        try {
            checkNumber(number);
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
