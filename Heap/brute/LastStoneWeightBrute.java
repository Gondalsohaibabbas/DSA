import java.util.Arrays;

public class LastStoneWeightBrute {

    public static int lastStoneWeight(int[] stones) {

        while (stones.length > 1) {

            Arrays.sort(stones);

            int n = stones.length;
            int y = stones[n - 1];
            int x = stones[n - 2];

            int[] temp;

            if (x == y) {
                temp = new int[n - 2];
                for (int i = 0; i < n - 2; i++)
                    temp[i] = stones[i];
            } else {
                temp = new int[n - 1];
                for (int i = 0; i < n - 2; i++)
                    temp[i] = stones[i];
                temp[n - 2] = y - x;
            }

            stones = temp;
        }

        return stones.length == 0 ? 0 : stones[0];
    }

    public static void main(String[] args) {

        int[] stones = {2,7,4,1,8,1};

        System.out.println(lastStoneWeight(stones));
    }
}

/*
Time Complexity: O(n² log n)
Space Complexity: O(n)
*/
