class Solution {
    public boolean search(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)return true;
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;//agar aage bdane pr bhi same element to fir se check isliye continue
            }
            //check for left sorted part
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else low=mid+1;
            }
            else {
                //check for right sorted part
                if(arr[mid]<=arr[high]){
                    if(arr[mid]<=target && target<=arr[high]){
                        low=mid+1;
                    }
                    else high=mid-1;
                }
            }
        }
        return false;
    }
}