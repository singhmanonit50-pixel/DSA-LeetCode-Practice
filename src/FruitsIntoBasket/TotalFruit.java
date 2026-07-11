package FruitsIntoBasket;

import java.util.HashMap;

public class TotalFruit {

    public static int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit to the basket
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // Shrink the window until we have at most 2 types of fruits
            while (map.size() > 2) {

                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            // Update maximum window length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] fruits = {1, 2, 1, 2, 3, 2, 2};

        int result = totalFruit(fruits);

        System.out.println("Maximum fruits collected: " + result);
    }
}