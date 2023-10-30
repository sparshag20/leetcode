class Solution {
    public int[][] merge(int[][] inter) {
        int n=inter.length;
        int l=0;
        int r=0;
        Arrays.sort(inter, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int s=inter[0][0];
        int e=inter[0][1];
        System.out.print(inter[0][0]);
        List<List<Integer>> l1=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(e>=inter[i+1][0]){
                e=Math.max(e,inter[i+1][1]);
            }
            else{
                l1.add(Arrays.asList(s,e));
                l++;
                s=inter[i+1][0];
                e=inter[i+1][1];
            }
        }
        l1.add(Arrays.asList(s,e));
        int arr[][]=new int[l1.size()][2];
        for(int i=0;i<l1.size();i++){
            arr[i][0]=l1.get(i).get(0);
            arr[i][1]=l1.get(i).get(1);
        }
        return arr;
    }
}