package SquareOfSortedArray;
import java.util.Arrays;

class Solution {

    public int[] sortedSquares(int[] nums) {

        int[] res = new int[nums.length];
        // Write your solution here
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;

        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare){
                res[index] = leftSquare;
                left++;
            }else{
                res[index] = rightSquare;
                right--;
            }
            index--;
        }

        return res;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] nums = {-7, -3, 2, 3, 11};

        Solution obj = new Solution();

        int[] ans = obj.sortedSquares(nums);

        System.out.println(Arrays.toString(ans));
    }
}