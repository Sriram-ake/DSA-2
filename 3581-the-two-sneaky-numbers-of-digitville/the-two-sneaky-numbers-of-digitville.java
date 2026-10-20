class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        int[] ans=new int[2];
        for(int i=0;i<nums.length-1;i++) 
        {
            if(nums[i]==nums[i+1]) {
                ans[cnt++]=nums[i];
            }
        }
        return ans;
    }
}