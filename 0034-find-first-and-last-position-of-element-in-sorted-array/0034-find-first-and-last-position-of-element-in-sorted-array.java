class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fp = -1;
        int low = 0;
        int high = nums.length - 1;

        // Find first position
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    fp = mid;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int sp = -1;
        low = 0;
        high = nums.length - 1;

        // Find second position
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    sp = mid;
                }
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{fp, sp};
    }
}
