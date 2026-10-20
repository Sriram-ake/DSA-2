class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String s1=String.format("%04d", num1);
        String s2=String.format("%04d", num2);
        String s3=String.format("%04d", num3);
        String min="";
        for(int i=0;i<4;i++) {
            int key=0;
            key=Math.min(s1.charAt(i) - '0',Math.min(s2.charAt(i) - '0',s3.charAt(i) - '0'));
            min+=key;
        }
        return Integer.parseInt(min);
    }
}