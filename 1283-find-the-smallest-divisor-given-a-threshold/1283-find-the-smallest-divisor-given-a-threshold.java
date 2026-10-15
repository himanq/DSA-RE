class Solution {
    int divisor(int []nums,int divisor){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/(double)divisor);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=-1;
        int max=Integer.MIN_VALUE;
       
       for(int i=0;i<nums.length;i++){
         max=Math.max(max,nums[i]);
       

       } 
       int low=1;
        int   high=max;
       
        
        while(low<=high){
            int mid=low+(high-low)/2;
          
           if(divisor(nums,mid)<=threshold){
            ans=mid;
            high=mid-1;
           }
          else low=mid+1;
        }
        return ans;
    }
}

//TC=0(log(max)x N)