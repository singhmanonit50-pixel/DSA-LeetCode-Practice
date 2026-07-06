package PermutationInString;

public class Main {

    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        if (m > n) return false;

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        // Frequency of s1 and first window of s2
        for (int i = 0; i < m; i++) {
            map1[s1.charAt(i) - 'a']++;
            map2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (isMatch(map1, map2)) {
            return true;
        }

        // Sliding Window
        for (int i = m; i < n; i++) {

            // Add new character
            map2[s2.charAt(i) - 'a']++;

            // Remove leftmost character
            map2[s2.charAt(i - m) - 'a']--;

            if (isMatch(map1, map2)) {
                return true;
            }
        }

        return false;
    }

    private boolean isMatch(int[] map1, int[] map2) {
        for (int i = 0; i < 26; i++) {
            if (map1[i] != map2[i]) {
                return false;
            }
        }
        return true;
    }

}
