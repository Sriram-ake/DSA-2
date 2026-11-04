class Solution {
    public boolean isGood(int[] nums) {
        int len=nums.length;
        if(len<2) return false;
        int n=len-1;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]!=i+1) return false;
        }
        return nums[n-1]==n && nums[n]==n;
    }
}
