package segregate0and1;

class Solution {

    void segregate0and1(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 1, 0, 1, 1};

        Solution obj = new Solution();

        obj.segregate0and1(arr);

        System.out.print("Output: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
