import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    /*
    Given an integer array nums and an integer k, return the k most frequent elements.
    You may return the answer in any order.
     */
    public static void main(String[] args){
        /*
        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]
         */
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] output = topK(nums, k);

        for(int num: output){
            System.out.println(num);
        }
    }

    public static int[] topK(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            pq.add(new int[]{e.getKey(), e.getValue()});
            while (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
        }

        return result;
    }
}
