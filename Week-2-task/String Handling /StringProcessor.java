class StringProcessor {
    // Method to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to count occurrences of a substring in a given string
    public static int countOccurrences(String text, String sub) {
        int count = 0, index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    // Method to split and capitalize each word in a string
    public static String splitAndCapitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String text = "hello guys";
        System.out.println("Reversed: " + reverseString(text));
        System.out.println("Occurrences of 'hello': " + countOccurrences(text, "hello"));
        System.out.println("Capitalized: " + splitAndCapitalize(text));
    }
}
