
class Solution {
    int findmax(int[] piles) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        return max;
    }

    int totalhours(int[] piles, int hourly) {
        int totalhour = 0;

        for (int i = 0; i < piles.length; i++) {
            totalhour += Math.ceil((double) piles[i] / hourly);
        }
        return totalhour;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int ans = Integer.MAX_VALUE;
        int low = 1;
        int high = findmax(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalhour = totalhours(piles, mid);

            if (totalhour <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
