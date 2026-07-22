class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[5];

            for (int j = i; j < n; j++) {
                char c = word.charAt(j);

                if (!isVowel(c))
                    break;

                if (c == 'a') freq[0]++;
                else if (c == 'e') freq[1]++;
                else if (c == 'i') freq[2]++;
                else if (c == 'o') freq[3]++;
                else if (c == 'u') freq[4]++;

                if (allPresent(freq))
                    count++;
            }
        }

        return count;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private boolean allPresent(int[] freq) {
        for (int x : freq) {
            if (x == 0)
                return false;
        }
        return true;
    }
}
