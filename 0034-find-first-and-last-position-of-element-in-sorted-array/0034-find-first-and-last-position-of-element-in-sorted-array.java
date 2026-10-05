class Solution {
    public int[] searchRange(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int lb = nums.length;

        // Lower bound: first index where nums[i] >= target
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Target doesn't exist
        if (lb == nums.length || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        low = 0;
        high = nums.length - 1;
        int ub = nums.length;

        // Upper bound: first index where nums[i] > target
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                ub = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{lb, ub - 1};
    }
}
