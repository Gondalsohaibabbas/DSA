public class FindClosestNumberToZeroBrute {

    public static int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(closest)) {
                closest = nums[i];
            } else if (Math.abs(nums[i]) == Math.abs(closest) && nums[i] > closest) {
                closest = nums[i];
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
