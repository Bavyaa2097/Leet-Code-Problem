class Solution {
    public int gcdOfOddEvenSums(int n) {

        int oddSum = 0;
        int evenSum = 0;

        // Calculate sum of first n odd numbers
        for (int i = 1; i <= n; i++) {
            oddSum += (2 * i - 1);
        }

        // Calculate sum of first n even numbers
        for (int i = 1; i <= n; i++) {
            evenSum += (2 * i);
        }

        // Find GCD using Euclidean Algorithm
        while (evenSum != 0) {
            int temp = evenSum;
            evenSum = oddSum % evenSum;
            oddSum = temp;
        }

        return oddSum;
    }
}
