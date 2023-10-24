import java.util.*;

class Solution {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        int [] fraction = KthSmallestPrimeFraction(arr, 3);
        System.out.println(fraction[0] + " / " + fraction[1]);

    }

    public static int[] KthSmallestPrimeFraction(int [] arr, int k) {
        //Make Priority queue using fractions of arr's elemnts as comparitors
        PriorityQueue<int[]> pQueue = new PriorityQueue<>((a, b) -> arr[a[0]]*arr[b[1]] - arr[b[0]]*arr[a[1]]);
        //Add possible fractions to priority queue
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                pQueue.add(new int [] {i, j});
            }
        }

        //result[0] = numerator's position, result[1] = denomenator's position
        int [] result = null;
        while (k > 0) {
            //Keep polling to the Kth
            result = pQueue.poll();
            k--;
        }
        return new int[] {arr[result[0]], arr[result[1]]};
    }

}
