class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>,Integer> hs=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            int j=0;
            List<Integer> l1=new ArrayList<>();
            while(j<grid.length){
                l1.add(grid[j][i]);
                j++;
            }
            hs.put(l1,hs.getOrDefault(l1,0)+1);
        }
         int count=0;
        for(int i=0;i<grid.length;i++){
            List<Integer> l1=new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                l1.add(grid[i][j]);
            }
            if(hs.containsKey(l1)){
                count=count+hs.get(l1);
            }
        }
        return count;
    }
}