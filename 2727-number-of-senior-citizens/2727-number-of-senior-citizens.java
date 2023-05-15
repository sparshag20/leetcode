class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            char c=details[i].charAt(11);
            char k=details[i].charAt(12);
            int m=Integer.parseInt(""+c);
            int l=Integer.parseInt(""+k);
            if(m==6 && l>0){
                count++;
            }
            else if(m>6){
                count++;
            }
        }
        return count;
    }
}