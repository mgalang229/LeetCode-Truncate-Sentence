class Solution {
    public String truncateSentence(String s, int k) {
        String ans = "", temp = "";
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                temp += c;
            } else if (counter < k) {
                ans += temp;
                counter++;
                if (counter < k) {
                    ans += " ";
                }
                temp = "";
            }
        }
        if (counter < k) {
            ans += temp;
        }
        return ans;
    }
}
