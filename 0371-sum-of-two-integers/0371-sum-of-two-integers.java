class Solution {
    public int getSum(int a, int b) {
        int k=b;
        if(b<0){
            k=-b;
        }
        while(k>0){
            if(b<0){
                a--;
            }
            else{
                a++;
            }
            k--;
        }
        return a;
    }
}