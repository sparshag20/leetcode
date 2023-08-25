class Solution {
    public int minimumSum(int n, int k) {
        HashSet<Integer> hs=new HashSet<>();
        int i=1;int sum=0;
        while(hs.size()!=n){
            if(!hs.contains(k-i)){
                hs.add(i);
                sum+=i;
            }
            i++;
        }
        return sum;
    }
}