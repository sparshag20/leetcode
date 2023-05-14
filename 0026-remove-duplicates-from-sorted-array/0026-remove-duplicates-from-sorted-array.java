class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0||nums.length==1) return nums.length;
        int j=0; //Index of unique elements
        for(int i =1;i<nums.length;i++){
            if(nums[i]!=nums[j]){ // Only when it is not same as the previous unique element
                nums[++j] = nums[i];// Incrementing the index while assigning the new value
            }
        }
        return ++j;// need to return number of elements instead of index
    }
}