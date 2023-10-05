class Solution {

    public int numRescueBoats(int[] people, int limit) {
        /*HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < people.length; i++) {
            hm.put(people[i], hm.getOrDefault(people[i], 0) + 1);
        }*/
        Arrays.sort(people);
        int count = 0;
        //System.out.print(hm);
        /*for (int i :people) {
            if (limit - i) && hm.get(i) > 0) {
                if (hm.get(limit - i) > 0) {
                    hm.put(limit - i, hm.get(limit - i) - 1);
                    hm.put(i, hm.get(i) - 1);
                    count++;
                    continue;
                }
            }
            if (hm.get(i) > 0) {
                hm.put(i, hm.get(i) - 1);
                count++;
            }
        }*/
        int l=0;int r=people.length-1;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                count++;
                l++;
                r--;
            }
            else{
                r--;
                count++;
            }
        }
        return count;
    }
}
