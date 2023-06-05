class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            String k=Integer.toBinaryString(i);
            arr[i]=noOfOnes(k);
        }
        return arr;
    }
    public int noOfOnes(String i){
        int count=0;
        for(char c:i.toCharArray()){
            if(c=='1'){
                count++;
            }
        }
        return count;
    }
}