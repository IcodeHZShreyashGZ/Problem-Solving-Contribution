class Solution {
    public int smallestNumber(int n, int t) {
        while (digiMul(n) % t != 0) {
            n++;
        }
        return n;
    }
    private int digiMul(int num) {
        int prod = 1;
        while (num > 0) {
            int digit = num % 10;
            prod *= digit;
            num /= 10;
        }
        return prod;
    }
}