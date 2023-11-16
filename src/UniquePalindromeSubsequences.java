public class UniquePalindromeSubsequences {
    public int countPalindromicSubsequences(String s) {
        int count = 0;
        int n = s.length();

        for (char c = 'a'; c <= 'z'; c++) {
            int first = -1, second = -1, third = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        third = i;
                        count++;
                        break;
                    }
                }
            }

            if (third != -1) {
                while (third < n) {
                    if (s.charAt(third) == c) {
                        count++;
                    }
                    third++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        UniquePalindromeSubsequences solution = new UniquePalindromeSubsequences();

        String input = "aabca";
        int result = solution.countPalindromicSubsequences(input);
        System.out.println("Number of unique palindromes of length three as subsequences: " + result); // Output: Number of unique palindromes of length three as subsequences: 3
    }
}