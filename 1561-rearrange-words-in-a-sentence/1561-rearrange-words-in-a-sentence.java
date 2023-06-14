class Solution {
    public String arrangeWords(String text) {
        String arr[]=text.split(" ");
        String k="";
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            l1.add(arr[i].length());
            l2.add(arr[i].length());
        }
        Collections.sort(l2);
        for(int i=0;i<l1.size();i++){
            if(l1.contains(l2.get(i))){
                int ind=l1.indexOf(l2.get(i));
                k+=arr[ind]+" ";
                l1.set(ind,0);
            }
        }
        String m=k.substring(0,1).toUpperCase();
        return k.charAt(1)==' '?m+" "+k.substring(1,k.length()).toLowerCase().trim():m+k.substring(1,k.length()).toLowerCase().trim();
        
    }
}