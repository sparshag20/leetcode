class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n=score.length;
        int m=score[0].length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            pq.add(score[i][k]);
            hm.put(score[i][k],i);
        }
        int arr[][]=new int[n][m];
        int c=0;
        while(!pq.isEmpty()){
            int i=hm.get(pq.poll());
            for(int j=0;j<m;j++){
                arr[c][j]=score[i][j];
            }
            c++;
        }
        return arr;

    }
}