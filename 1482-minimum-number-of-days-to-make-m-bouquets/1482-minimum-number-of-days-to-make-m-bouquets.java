class Solution {
    boolean possiblebloom(int[] bloomDay, int m, int k, int day) {
        int consecutive = 0;
        int noofbouquet = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                consecutive++;
            } else {
                noofbouquet += consecutive / k;
                consecutive = 0;
            }
        }

        noofbouquet += consecutive / k;

        return noofbouquet >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (m > bloomDay.length / k) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }

        int low = min;
        int high = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possiblebloom(bloomDay, m, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}