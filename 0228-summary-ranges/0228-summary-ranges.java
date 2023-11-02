class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> l1=new ArrayList<>();
        if(n==0){
            return l1;
        }
        if(n==1){
            l1.add(""+nums[0]);
            return l1;
        }
        int s=nums[0];
        int e=nums[0];
        for(int i=0;i<n-1;i++){
            if(nums[i]+1==nums[i+1]){
                e=nums[i+1];   
            }
            else{
                if(s==e){
                    l1.add(""+s);
                    s=nums[i+1];
                    e=nums[i+1];
                    continue;
                }
                l1.add(s+"->"+e);
                s=nums[i+1];
                e=nums[i+1];
            }
        }
        if(nums[n-1]==nums[n-2]+1){
            l1.add(s+"->"+e);
        }
        else{
            l1.add(""+s);
        }
        return l1;
    }
}