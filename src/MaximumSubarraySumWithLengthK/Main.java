package MaximumSubarraySumWithLengthK;

class Solution {

    public int maximumSumSubarray(int[] arr, int k) {

        int n = arr.length;

        // First window ka sum
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Window ko slide karo
        for (int i = k; i < n; i++) {

            windowSum = windowSum - arr[i - k];
            windowSum = windowSum + arr[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] arr = {100, 200, 300, 400};
        int k = 2;

        Solution obj = new Solution();

        int ans = obj.maximumSumSubarray(arr, k);

        System.out.println("Maximum Sum = " + ans);
    }
}