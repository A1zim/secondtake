import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner newWord = new Scanner(System.in);
        String word = newWord.nextLine();
        boolean isP = isPalindrome(word);
        if (isP)
            System.out.println(word+"is Palindrome");
        else
            System.out.println(word+"isn't Palindrome");
    }
    public static boolean isPalindrome(String sentence) {
        StringBuilder sentenceWithoutSpaces = new StringBuilder();
        for (char ch : sentence.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sentenceWithoutSpaces.append(Character.toLowerCase(ch));
            }
        }
        int left = 0;
        int right = sentenceWithoutSpaces.length() - 1;

        while (left < right) {
            if (sentenceWithoutSpaces.charAt(left) != sentenceWithoutSpaces.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
