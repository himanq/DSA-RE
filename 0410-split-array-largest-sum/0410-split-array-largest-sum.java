class Solution {
       int countStudents(int[] arr, long pages) {
        int student = 1;
        long pagesStudent = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                student++;
                pagesStudent = arr[i];
            }
        }
        return student;
    }

    public int findPages(int[] arr, int m) {
        if (m > arr.length) return -1;

        long max = 0;
        long sum = 0;

        for (int pages : arr) {
            max = Math.max(max, pages);
            sum += pages;
        }

        long low = max;
        long high = sum;
        long ans = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (countStudents(arr, mid) <= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }

    public int splitArray(int[] nums, int k) {
      return findPages(nums,k)  ;
    }
}