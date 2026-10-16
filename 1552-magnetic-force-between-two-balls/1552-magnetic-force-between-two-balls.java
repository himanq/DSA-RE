class Solution {
     boolean canweplacecows(int[]arr,int distance,int cows){
        int ccows=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=distance){
                ccows++;
                last=arr[i];
            }
            
        }
         if(ccows>=cows)return true;
                return false;
    }
    public int maxDistance(int[] arr, int cows) {
         Arrays.sort(arr);
               
               int max=Integer.MIN_VALUE;
               for(int i=0;i<arr.length;i++){
                   max=Math.max(max,arr[i]);
               }
              int low=1; 
              int high=max;
              int ans=-1;
              while(low<=high){
                  int mid=(low+high)/2;
                  if(canweplacecows(arr,mid,cows)==true){
                      ans=mid;
                      low=mid+1;//hum log max find krna to left mein to smaller values hogi
                  }
                  else high=mid-1;
              }
        return ans;
    }
}