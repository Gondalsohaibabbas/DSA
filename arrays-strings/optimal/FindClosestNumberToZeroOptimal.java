public class FindClosestNumberToZeroOptimal {

    public static int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest)) {
                closest = num;
            } else if (Math.abs(num) == Math.abs(closest) && num > closest) {
                closest = num;
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -2, 1, 4, 8};

        System.out.println("Closest Number to Zero: " + findClosestNumber(nums));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
