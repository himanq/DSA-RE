class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        int ans=-1;
        int low=1;
        int high=x;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid<=x/mid){// that is similar to mid*mid<=x ,, to avoid integer overflow we done this
           ans=(int)mid;
           low=(int)mid+1;
            }
            else high=(int)mid-1;
        }
        return ans;
    }
}