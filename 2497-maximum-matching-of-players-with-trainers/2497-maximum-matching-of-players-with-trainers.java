class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<players.length;i++){
            pq.add(players[i]);
        }
        for(int i=0;i<trainers.length;i++){
            pq2.add(trainers[i]);
        }
        int count=0;
        while(!pq.isEmpty() && !pq2.isEmpty()){
            int k=pq.poll();
            if(k<=pq2.peek()){
                pq2.poll();
                count++;
            }
        }
        return count;
    }
}