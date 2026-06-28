public class ValidPalindromeBrute {

    public static boolean isPalindrome(String s) {

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
