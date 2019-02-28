public class PalindromeTester {
    public static void main(String[] args) {
        System.out.println("racecar: " + Palindrome.isPalindrome("racecar"));
        System.out.println("a: " + Palindrome.isPalindrome("a"));
        System.out.println("A man, a plan, a canal - Panama!: " + Palindrome.isPalindrome("A man, a plan, a canal - Panama!"));
        System.out.println(" : " + Palindrome.isPalindrome(""));
        System.out.println("furry cat: " + Palindrome.isPalindrome("furry cat"));
    }
}