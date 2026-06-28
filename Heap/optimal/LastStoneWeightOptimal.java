import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeightOptimal {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> heap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones)
            heap.offer(stone);

        while (heap.size() > 1) {

            int y = heap.poll();
            int x = heap.poll();

            if (y != x)
                heap.offer(y - x);
        }

        return heap.isEmpty() ? 0 : heap.poll();
    }

    public static void main(String[] args) {

        int[] stones = {2,7,4,1,8,1};

        System.out.println(lastStoneWeight(stones));
    }
}

/*
Time Complexity: O(n log n)
Space Complexity: O(n)
*/
