class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        int left=0;
        int right=0;
        int maxLen=0;
        int currLen=0;
        while(right<s.length()){
            if(hash[s.charAt(right)]!=-1){ //that is in the map
                if (hash[s.charAt(right)] >= left) {
                    left = hash[s.charAt(right)] + 1;
                }
            }
            currLen = right - left + 1;
            maxLen = Math.max(maxLen, currLen);

            hash[s.charAt(right)] = right;
            right++;
        }
        return maxLen;
            }
        }
        