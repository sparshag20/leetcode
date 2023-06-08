class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        List<Integer> l1=new ArrayList<>();
        int arr[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            l1.add(A[i]);int count=0;
            for(int j=0;j<i+1;j++){
                if(l1.contains(B[j])){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}