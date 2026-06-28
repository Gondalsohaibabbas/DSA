import java.util.*;

public class TopKFrequentElementsOptimal {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer> heap =
                new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int key : map.keySet()) {

            heap.offer(key);

            if (heap.size() > k)
                heap.poll();
        }

        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--)
            result[i] = heap.poll();

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};

        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }
}

/*
Time Complexity: O(n log k)
Space Complexity: O(n)
*/
