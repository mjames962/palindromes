import java.util.Scanner;

/**
 * A class that lets the user input a string and then be told if that string is a palindrome. E.g if that string
 * is spelt the same backwards. The program then checks every circular permutation for palindromes.
 *
 * @author Mitch James
 */
public class Palindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String userInput = in.nextLine(); // what the user literally input

        String reverseString = "";
        // the user's string without spaces that has/will be rearranged
        String userString = userInput.replaceAll(" ", "");

        // loops until every circular permutation has been checked
        for (int j = 0; j < userString.length(); j++) {

            // stores the reversed string of the permutation
            for (int i = userString.length(); i > 0; i--) {

                String Char = userString.substring(i - 1, i);

                reverseString = reverseString + Char;
            }

            // output whether string is palindrome
            if (userString.equalsIgnoreCase(reverseString)) {
                System.out.println("The string '" + userString + "' is a palindrome");
            } else {
                System.out.println("The string '" + userString + "' is not a palindrome");
            }

            // next permutation
            String firstChar = userString.substring(0, 1);
            String restOfString = userString.substring(1);
            userString = restOfString + firstChar;
            reverseString = ""; // reset variable
        }

    }

}
