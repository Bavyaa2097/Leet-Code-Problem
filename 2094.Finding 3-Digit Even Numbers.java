class Solution {
    public int[] findEvenNumbers(int[] digits) {
        boolean[] used = new boolean[1000];

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) continue;

            for (int j = 0; j < digits.length; j++) {
                if (i == j) continue;

                for (int k = 0; k < digits.length; k++) {
                    if (k == i || k == j) continue;

                    if (digits[k] % 2 != 0) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    used[num] = true;
                }
            }
        }

        int count = 0;
        for (int i = 100; i < 1000; i++) {
            if (used[i]) count++;
        }

        int[] ans = new int[count];
        int idx = 0;
        for (int i = 100; i < 1000; i++) {
            if (used[i]) ans[idx++] = i;
        }

        return ans;
    }
}
