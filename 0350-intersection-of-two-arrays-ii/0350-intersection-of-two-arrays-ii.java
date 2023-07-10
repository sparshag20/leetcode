class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            l1.add(nums1[i]);
        }
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(l1.contains(nums2[i])){
                int ind=l1.indexOf(nums2[i]);
                l1.remove(ind);
                l2.add(nums2[i]);
            }
        }
        int arr[]=new int[l2.size()];
        for(int i=0;i<l2.size();i++){
            arr[i]=l2.get(i);
        }
        return arr;
    }
}