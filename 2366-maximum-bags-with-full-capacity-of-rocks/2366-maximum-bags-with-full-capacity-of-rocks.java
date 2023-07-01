class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int ar) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int count=0;
        for(int i=0;i<rocks.length;i++){
            int diff=capacity[i]-rocks[i];
            if(diff==0){
                count++;
            }
            else{
                pq.add(diff);
            }
        }
        
        while(!pq.isEmpty() && ar!=0){
            int v=pq.poll();
            if(ar>=v){
                count++;
                ar=ar-v;
            }
        }
        return count;
    }
}