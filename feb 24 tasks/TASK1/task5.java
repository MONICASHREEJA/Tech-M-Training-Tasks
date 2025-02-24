import java.util.Scanner;

public class AlternateCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string with alternate capitalization
        String result = capitalizeAlternate(input);

        // Output result
        System.out.println("Formatted String: " + result);

        scanner.close();
    }

    public static String capitalizeAlternate(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Capitalize even index characters, lowercase odd index characters
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
}
