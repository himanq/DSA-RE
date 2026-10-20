class Solution {
    public int[] plusOne(int[] arr) {
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){
               arr[i]++;
               return arr;
            }
            //agar 9 se bdi to 0 bnao
            arr[i]=0;
        }
        //maan lo sare 9 to
        int []ans=new int[arr.length+1];
        ans[0]=1;
        return ans;
    }
}