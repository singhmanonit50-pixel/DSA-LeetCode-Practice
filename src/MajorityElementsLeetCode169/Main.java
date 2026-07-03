package MajorityElementsLeetCode169;//package MajorityElementsLeetCode169;
//
//import java.util.HashMap;
//
//public class Main {
//
//    public int majorityElement(int[] nums) {
//
//        int candidate = 0;
//        int count = 0;
//
//        for (int num : nums) {
//
//            if (count == 0) {
//                candidate = num;
//            }
//
//            if (num == candidate) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//
//        return candidate;
//    }
//
//    public static void main(String[] args) {
//
//        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//
//        Main obj = new Main();
//
//        int ans = obj.majorityElement(nums);
//
//        System.out.println(ans);
//    }
//}


import java.util.HashMap;

public class Main {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        Main obj = new Main();

        System.out.println(obj.majorityElement(nums));
    }
}