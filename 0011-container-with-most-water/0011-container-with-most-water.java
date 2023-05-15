class Solution {
    public int maxArea(int[] height) {
                int f=0;
        int l=height.length-1;
        int Area=0;
        while(f<l){
            if(height[f]<height[l]){
                Area=Math.max(Area,(l-f)*height[f]);
                f++;
            }
            else{
                Area=Math.max(Area,(l-f)*height[l]);
                l--;
            }
        }
        return Area;
    }
}