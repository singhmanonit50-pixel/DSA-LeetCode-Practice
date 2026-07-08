package TwoSumII;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }
}
public class Main{
    public static void main(String[] args){
        int[] nums = {2,5,6,7,9,12};

        int target = 14;
        Solution obj = new Solution();
        int[] ans = obj.twoSum(nums, target);

        System.out.println(Arrays.toString(ans));
    }
}