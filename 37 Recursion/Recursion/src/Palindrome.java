public class Palindrome {

    // A man, a plan, a canal - Panama!

    public static boolean isPalindromeCopy(String string) {
        char firstChar = Character.toLowerCase(string.charAt(0));
        char lastChar = Character.toLowerCase(string.charAt(string.length() - 1));

        if (Character.isLetter(firstChar) && Character.isLetter(lastChar)) {
            if (firstChar == lastChar) {
                String substring = string.substring(1, string.length() - 1);
                return isPalindrome(substring);
            } else {
                return false;
            }
        } else if (!Character.isLetter(firstChar)) {
            String substring = string.substring(1);
            return isPalindrome(substring);
        } else {
            String substring = string.substring(0, string.length() - 1);
            return isPalindrome(substring);
        }
    }

    public static boolean isPalindrome(String string) {
        return isPalindrome(string, 0, string.length() - 1);
    }

    public static boolean isPalindrome(String string, int first, int last) {
        if (first >= last) {
            return true;
        } else {
            char firstChar = Character.toLowerCase(string.charAt(first));
            char lastChar = Character.toLowerCase(string.charAt(last));

            if (Character.isLetter(firstChar) && Character.isLetter(lastChar)) {
                if (firstChar == lastChar) {
                    return isPalindrome(string, first + 1, last - 1);
                } else {
                    return false;
                }
            } else if (!Character.isLetter(firstChar)) {
                return isPalindrome(string, first + 1, last);
            } else {
                return isPalindrome(string, first, last - 1);
            }
        }
    }
}