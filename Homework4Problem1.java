import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int [] nums = {1,1,1,2,2,3};

        System.out.println("[");
        for (int i : nums) {
            System.out.print(i + ",");
        }
        System.out.print("]");
        List<Integer> topK = TopKElements(nums, 2);

        System.out.println(topK);

    }

    public static List<Integer> TopKElements(int [] nums, int k) {
        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        //Organize array into a map
        for (int i = 0; i < nums.length; i++) {
            hashmap.put(nums[i], hashmap.getOrDefault(nums[i],0) + 1);
        }
        //Sort unique elements by frequencies into tree map
        TreeMap<Integer, List<Integer>> elementFreq = new TreeMap<>();
        for(int i : hashmap.keySet()) {
            int n = hashmap.get(i);
            if(!elementFreq.containsKey(n)) elementFreq.put(n, new LinkedList<>());
            elementFreq.get(n).add(i);
        }

        List<Integer> TopKList = new ArrayList<>();
        //Get poll tree map for list of top k element
        while(TopKList.size() < k) {
            Map.Entry<Integer, List<Integer>> ent = elementFreq.pollLastEntry();
            TopKList.addAll(ent.getValue());
        }
        return TopKList;
    }
}
