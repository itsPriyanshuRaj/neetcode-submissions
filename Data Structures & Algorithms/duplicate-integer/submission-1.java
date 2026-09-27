class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 3. 
        HashSet<Integer> hs = new HashSet<>();
        for(int ele:nums){
            if(hs.contains(ele)){
                return true;
            }
            hs.add(ele);
        }
        return false;
        // HashMap<Integer, Integer> hs = new HashMap<>();
        // 1.        
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}