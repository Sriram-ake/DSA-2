class Solution{
    public int numOfSubarrays(int[] arr){
        int odd=0;
        int even=1;
        int count=0;
        int mod=1000000007;
        int sum=0;
        for(int num:arr){
            sum+=num;
            if(sum%2==0){
                count+=odd;
                even++;
            }else{
                count+=even;
                odd++;
            }
            count%=mod;
        }
        return count;
    }
}
