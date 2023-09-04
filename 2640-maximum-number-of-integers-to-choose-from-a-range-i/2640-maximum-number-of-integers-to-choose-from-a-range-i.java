class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> l1=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            l1.add(banned[i]);
        }
        int sum=0;int count=0;
        for(int i=1;i<=n;i++){
            if(!l1.contains(i)){
                sum+=i;
                if(sum<=maxSum){
                    count++;
                }
            }
        }
        return count;
    }
}