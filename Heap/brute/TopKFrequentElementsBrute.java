import java.util.*;

public class TopKFrequentElementsBrute {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];

        for (int i = 0; i < k; i++)
            result[i] = list.get(i).getKey();

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};

        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }
}

/*
Time Complexity: O(n log n)
Space Complexity: O(n)
*/
