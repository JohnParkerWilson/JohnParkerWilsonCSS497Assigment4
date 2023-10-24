import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int [] nums = {2,-1,2};
        int k = 3;
        System.out.println(minSubArrayK(nums, k));

    }

    public static int minSubArrayK(int [] nums, int target) {
        int sum = 0;
        int j = 0;
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while(sum >= target) {
                len = Math.min(len, i - j);
                sum -= nums[j];
                j++;
            }
        }
        if (len == Integer.MAX_VALUE) return -1;
        else return len;
    }

}
