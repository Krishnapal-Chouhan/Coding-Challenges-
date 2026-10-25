
class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder("");
        int low = 0;
        int res = 0;

        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);

            while (sb.indexOf(String.valueOf(ch)) != -1) {
                sb.deleteCharAt(0);
                low++;
            }

            sb.append(ch);

            int len = high - low + 1;
            res = Math.max(res, len);
        }

        return res;
    }
}
