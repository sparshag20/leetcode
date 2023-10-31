class Solution {
    public int removeCoveredIntervals(int[][] in) {
        int n=in.length;
        int temp=n;
        Arrays.sort(in, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int s=in[0][0];
        int e=in[0][1];
        for(int i=1;i<n;i++){
            if(s<=in[i][0] && e>=in[i][1]){
                temp--;
            }
            else if(s==in[i][0] && e<in[i][1]){
                temp--;
                s=in[i][0];
                e=in[i][1];
            }
            else{
                s=in[i][0];
                e=in[i][1];
            }
        }
        return temp;
    }
}