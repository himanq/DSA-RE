class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            //for single elements only
              if (low == high) {
                ans = Math.min(ans, nums[low]);
                break;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
              ans = Math.min(ans, nums[low]);
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
            else {
                //right part is sorted
                ans=Math.min(ans,nums[mid]);
                high=mid-1;

            }
        }
        return ans;
    }
}