class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;int n1=nums2.length;double mod=0;
        int n3[]=new int[n+n1];
        for(int i=0;i<n;i++){
            n3[i]=nums1[i];
        }
        for(int i=0;i<n1;i++){
            n3[i+n]=nums2[i];
        }
        Arrays.sort(n3);
        if(n3.length%2==0){
            int mid=n3.length/2 -1;
            mod=(n3[mid]+n3[mid+1])/2.0;
        }
        else{
           int mid=n3.length/2 ;
           mod=n3[mid]; 
        }
        return mod;
    }
}