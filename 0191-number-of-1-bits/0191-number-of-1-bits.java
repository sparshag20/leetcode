public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        String k=Integer.toBinaryString(n);
        for(int i=0;i<k.length();i++){
            if(k.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}