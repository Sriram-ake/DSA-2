class Solution {
    public String concatHex36(int n) {
        long n2 = (long) n * n;
        long n3 = n2 * n;
        String hex = Long.toString(n2, 16).toUpperCase();
        String base36 = Long.toString(n3, 36).toUpperCase();
        return hex + base36;
    }
}