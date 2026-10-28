
class Solution {
    public String minWindow(String s, String t) {
        int l = 0, r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int sindex = -1;
        int minlen = Integer.MAX_VALUE;

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i),
                    map.getOrDefault(t.charAt(i), 0) + 1);
        }

        while (r < s.length()) {
            char ch = s.charAt(r);

            if (map.containsKey(ch) && map.get(ch) > 0) {
                count++;
            }

            map.put(ch, map.getOrDefault(ch, 0) - 1);

            while (count == t.length()) {
                if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    sindex = l;
                }

                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) + 1);

                if (map.get(leftChar) > 0) {
                    count--;
                }

                l++;
            }

            r++;
        }

        return sindex == -1 ? "" : s.substring(sindex, sindex + minlen);
    }
}
