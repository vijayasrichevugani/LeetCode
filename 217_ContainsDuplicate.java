class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int i : nums){
            if(hset.contains(i))
                return true;
            else
                hset.add(i);
        }
        return false;
    }
}
