class Solution {
    public int maxScore(int[] arr, int k) {
        int lsum=0;
        int rsum=0;
        int maxsum=0;
        for(int i=0;i<=k-1;i++){
            lsum=lsum+arr[i];
            maxsum=lsum;
        }
        int rightindex=arr.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-arr[i];
            rsum=rsum+arr[rightindex];
            rightindex--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}