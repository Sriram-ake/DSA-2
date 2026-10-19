class Solution {
    public long removeZeros(long n) {
        long res = 0, place = 1;
        while (n > 0) {
            long d = n % 10;
            if (d != 0) {
                res += d * place;
                place *= 10;
            }
            n /= 10;
        }
        return res;
    }
}