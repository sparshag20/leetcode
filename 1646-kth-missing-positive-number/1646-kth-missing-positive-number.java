class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int r=arr[n-1];
        int i=1;int j=0;int count=0;
        while(i<=r){
            if(arr[j]==i){
                j++;
            }
            else{
                count++;
            }
            if(k==count){
                return i;
            }
            i++;
        }
        return r+(k-count);
    }
}