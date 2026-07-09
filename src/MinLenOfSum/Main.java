package MinLenOfSum;


class Solution {

    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLen = nums.length + 1;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {

                int length = right - left + 1;

                if (length < minLen) {
                    minLen = length;
                }

                sum -= nums[left];
                left++;
            }
        }

        if (minLen == nums.length + 1) {
            return 0;
        }

        return minLen;
    }
}

public class Main {

    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        Solution obj = new Solution();

        int ans = obj.minSubArrayLen(target, nums);

        System.out.println("Minimum Length = " + ans);
    }
}
