import java.util.*;

class Solution {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};

        System.out.println(KClosestToX(nums, 4, 3));

    }

    public static List<Integer> KClosestToX(int [] nums, int k, int x) {
        //Do a binary search
        int left = 0;
        int right = nums.length - 1;
        //Find the k elements closest to x
        while (right - left >= k) {
            //|a - x| < |b - x|
            //Or, |a - x| == |b - x| and a < b
            if (Math.abs(nums[left] - x) > Math.abs(nums[right] - x)) left++;
            else right--;
        }

        //Put k closest elements into array of size k
        List<Integer> results = new ArrayList<>(k);
        for (int i = left; i <= right; i++) results.add(nums[i]);
        return results;
    }
}
