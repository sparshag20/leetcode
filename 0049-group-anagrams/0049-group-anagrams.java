class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        List<List<String>> l1=new ArrayList<>();
        for(String word:strs){
            char str[]=word.toCharArray();
            Arrays.sort(str);
            String wd=String.valueOf(str);
            if(!hm.containsKey(wd)){
                hm.put(wd,new ArrayList<>());
            }
            hm.get(wd).add(word);
        }
        l1.addAll(hm.values());
        return l1;
    }
}