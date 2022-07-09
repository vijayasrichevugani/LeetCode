import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i],1);
            }
            else{hmap.put(nums[i],hmap.get(nums[i])+1);}
        }
        
        for(Entry<Integer, Integer> entry: hmap.entrySet()) {
              if(entry.getValue() == 1) {
                    res = entry.getKey();
                break;
              }
        }
        return res;
    }
}
