import java.lang.StringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Madam, I'm Adam!";
        String formatString = string.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        StringBuilder stringBuilder = new StringBuilder(formatString).reverse();
        String reverseString  = stringBuilder.toString();

        if (formatString.equals(reverseString))
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string isn't a palindrome");
    }
}
