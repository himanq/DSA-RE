
class Solution {
    public int lengthOfLongestSubstring(String s) {
      int maxlen=0;
      int right=0;
      int left=0;
      int maxl=0;
        HashSet<Character> hashSet = new HashSet<>();
        while (right < s.length()) {
            if (!hashSet.contains(s.charAt(right))) {
                hashSet.add(s.charAt(right));
                right++;
                maxl = Math.max(hashSet.size(), maxl);
            } else {
                hashSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxl;
    }
}
