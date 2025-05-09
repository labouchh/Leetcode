class Solution {
    public boolean isPalindrome(int x) {
        boolean isPalindrome = true;
        int y = 0;
        int og = x;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            int n = x % 10;
            y = y * 10 + n;
            x = x / 10;
        }
        return og == y;
    }
}