class Solution {
    public int singleNumber(int[] arr) {
        Arrays.sort(arr);int count=1;int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                if(count==1){
                    return arr[i];
                }
                count=1;
            }
            else{
                count++;
            }
        }
        return arr[n-1];
    }
}