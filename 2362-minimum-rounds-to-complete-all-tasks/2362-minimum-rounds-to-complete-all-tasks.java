class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Arrays.sort(tasks);
        int n=tasks.length;
        for(int i=0;i<n;i++){
            hm.put(tasks[i],hm.getOrDefault(tasks[i],0)+1);
        }
        int count=0;
        for(int h:hm.keySet()){
            int j=hm.get(h);
            if(j<2){
                return -1;
            }
            else if(j==2){
                count++;
            }
            else{
                count=count+j/3;
                if(j%3>=1){
                    count++;
                }
            }
        }
        return count;
    }
}