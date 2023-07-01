class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int c=0;
        while(c<k){
            pq.add(pq.poll()+1);
            c++;
        }
        long pr=1;
        while(!pq.isEmpty()){
            pr=(pr*pq.poll())% 1000000007;
        }
        return (int)pr;
    }
}