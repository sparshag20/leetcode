class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        HashSet<Integer> hm=new HashSet<>();
        int n1=nums1.length;
        int n2=nums2.length;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int min3=Integer.MAX_VALUE;
        boolean f=false;
        for(int i=0;i<n1;i++){
            min1=Math.min(min1,nums1[i]);
            hm.add(nums1[i]);
        }
        for(int i=0;i<n2;i++){
            min2=Math.min(min2,nums2[i]);
            if(hm.contains(nums2[i])){
                 min3=Math.min(min3,nums2[i]);
                f=true;
            }
        }
        if(f){
            return min3;
        }
        if(min1<=min2){
            return min1*10 + min2; 
        }
        return min2*10 + min1;
        
    }
}