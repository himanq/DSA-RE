class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;

        // Last ke spaces skip kare ke liye

        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        int count=0;

        //Last word ki length count karna
        
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}