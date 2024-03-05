public class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int chL = s.charAt(l);
            int chR = s.charAt(r);
            if (chL != chR) {
                break;
            }

            while (l <= r && s.charAt(l) == chL) {
                l++;
            }
            while (l < r && s.charAt(r) == chL) {
                r--;
            }
            if (l - r == 1) {
                return 0;
            }

        }

        return r - l + 1;
    }
}
