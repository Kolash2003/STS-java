import java.util.*;
public class LexicographicallyBinaryPalindrome {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Convert string to char array
        char[] charArray = input.toCharArray();

        // Step 3: Sort the char array
        Arrays.sort(charArray);

        // Step 4: Use two pointers to check for palindrome in sorted array
        boolean isPalindrome = isPalindromeUsingTwoPointers(charArray);

        // Step 5: Output the result
        if (isPalindrome) {
            System.out.println("The sorted characters of the string can form a palindrome.");
        } else {
            System.out.println("The sorted characters of the string cannot form a palindrome.");
        }

        scanner.close();
    }

    // Function to check if sorted char array forms a palindrome using two pointers
    public static boolean isPalindromeUsingTwoPointers(char[] charArray) {
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;  // Not a palindrome
            }
            left++;
            right--;
        }
        return true;  // Is a palindrome
    }
}
