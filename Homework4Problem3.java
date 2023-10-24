import java.util.*;

class Solution {
    public static void main(String[] args) {
        int [] arr = {15, 13, 12, 10, 8, 9};

        System.out.println(peekTopK(arr, 5));

    }

    public static List<Integer> peekTopK(int [] arr, int k) {
        //make a priority queue using arr
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a,b) -> arr[b]- arr[a]);
        List<Integer> results = new ArrayList<>();
        //"initialize" queue with first element
        pQueue.add(0);
        //iterate k times
        while (k > 0) {
            //poll queue for largest element at the time and insert to list of results
            int top = pQueue.poll();
            results.add(arr[top]);
            //Get left and right children
            int left = 2*top + 1;
            int right = left + 1;
            if (left < arr.length) {
                pQueue.add(left);
            }
            if (right < arr.length) {
                pQueue.add(right);
            }
            k--;
        }
        return results;
    }
}
