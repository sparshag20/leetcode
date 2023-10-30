class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=0;int count=0;
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[j]==nums[i]){
                if(count<2){
                l1.add(nums[j]);
                count++;
                }
            }
            else{
                j=i;
                l1.add(nums[j]);
                count=1;
            }
        }
        for(int i=0;i<l1.size();i++){
            nums[i]=l1.get(i);
        }
        return l1.size();
    }
}