class Solution {
    public int countB(int n){
        int count=0;
        String st=Integer.toBinaryString(n);
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int k=countB(arr[i]);
            if(!hm.containsKey(k)){
                hm.put(k,new ArrayList<>());
            }
            hm.get(k).add(arr[i]);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:hm.keySet()){
            pq.add(i);
        }
        int num[]=new int[n];
        int j=0;
        while(!pq.isEmpty()){
            List<Integer> l2=hm.get(pq.poll());
            Collections.sort(l2);
            for(int i:l2){
                num[j++]=i;
            }
        }
        return num;
    }
}