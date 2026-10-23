class Solution {
    public int sortPermutation(int[] nums) {
        int n=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(i!=nums[i]) n&=i;
        }
        if(n==Integer.MAX_VALUE) return 0;
        return n;
    }
}