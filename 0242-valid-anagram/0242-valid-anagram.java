class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
       int arr[]=new int[26];
       for(int i=0;i<s.length();i++){
           int a=(int)s.charAt(i)-97;
           int b=(int)t.charAt(i)-97;
           arr[a]=arr[a]+1;
           arr[b]=arr[b]-1;
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               return false;
           }
       }
       return true;

    }
}