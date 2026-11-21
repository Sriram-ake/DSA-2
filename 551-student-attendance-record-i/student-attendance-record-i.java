class Solution {
    public boolean checkRecord(String s) {
        int cnt1=0,cnt2=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='A') cnt1++;
            if(s.charAt(i)=='L'){
                cnt2++;
            }
            else {
                cnt2=0;
            }
            if(cnt1>=2||cnt2>=3) return false;
        }
        return true;
    }
}