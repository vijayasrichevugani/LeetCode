class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List op = new ArrayList(nums.length);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int val: map.keySet()){
            if(map.get(val) == 2){
                op.add(val);
            }
            else{continue;}
        }
        return op;
    }
}
