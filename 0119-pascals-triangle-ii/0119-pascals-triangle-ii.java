class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> l1=new ArrayList<>();
        List<Integer> l3=new ArrayList<>();
        List<Integer> l4=new ArrayList<>();
        l3.add(1);
        l4.add(1);
        l4.add(1);
        l1.add(new ArrayList<>(l3));
        if(rowIndex==0){
            return l3;
        }
        if(rowIndex==1){
            return l4;
        }
        l1.add(new ArrayList<>(l4));
        for(int i=2;i<=rowIndex;i++){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            List<Integer> l2=l1.get(i-1);
            for(int j=0;j<l2.size()-1;j++){
                l.add(l2.get(j)+l2.get(j+1));
            }
            l.add(1);
            l1.add(new ArrayList<>(l));
        }
        return l1.get(rowIndex);
    }
}