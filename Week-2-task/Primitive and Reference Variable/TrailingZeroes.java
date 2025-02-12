import java.util.Scanner;

class TrailingZeroes {
    static int findTrailingZeroes(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int zeroes = findTrailingZeroes(num);
        System.out.println("Number of Trailing zeroes are: " + zeroes);
    }
}
