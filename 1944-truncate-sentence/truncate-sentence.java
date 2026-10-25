class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String[] result = Arrays.copyOfRange(arr, 0, k);
        return String.join(" ", result);
    }
}