class Solution {
    int requiredDays(int [] weights,int capacity){
        int load=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
          if(load+weights[i]>capacity){
            day++;
            load=weights[i];
          }
          else {
            load+=weights[i];
          }
          
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(requiredDays(weights,mid)<=days){
               ans=mid;
               high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}