class Solution {
    public List<List<Integer>> groupThePeople(int[] g) {
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        int n=g.length;
        List<List<Integer>> l1=new ArrayList<>();
        for(int i=0;i<n;i++){

            if(hm.containsKey(g[i])){
                if(hm.get(g[i]).size()<g[i]){
                    hm.get(g[i]).add(i);
                }else{
                    l1.add(new ArrayList<>(hm.get(g[i])));
                    hm.remove(g[i]);
                    hm.put(g[i],new ArrayList<>());
                    hm.get(g[i]).add(i);
                }
            }
            else{
                hm.put(g[i],new ArrayList<>());
                hm.get(g[i]).add(i);
            }

        }
        for(int l:hm.keySet()){
            l1.add(new ArrayList<>(hm.get(l)));
        }
        return l1;
    }
}