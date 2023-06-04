class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int max=0;
        for(int i=0;i<n;i++){
            String arr1[]=sentences[i].split(" ");
            max=Math.max(arr1.length,max);
        }
        return max;
    }
}