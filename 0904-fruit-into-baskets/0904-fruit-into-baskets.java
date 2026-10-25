class Solution {
    public int totalFruit(int[] fruits) {
        int low =0;
                        
                        int res=0;
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int high =0; high<fruits.length;high++){
            int fruit = fruits[high];
            map.put(fruit, map.getOrDefault(fruit, 0)+1);

            while(map.size()>2){
                int lowch = fruits[low];
               
                 if (map.get(lowch) == 1) {
                    map.remove(lowch);
                } else {
                    map.put(lowch, map.get(lowch) - 1);
                }
               low++;

            }


            int len = high - low + 1;
            res = Math.max(res, len);



            }
             return res;
        
       
    }
}