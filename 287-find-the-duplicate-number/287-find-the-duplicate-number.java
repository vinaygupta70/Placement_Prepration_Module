class Solution {
    public int findDuplicate(int[] nums) {
        int i=0,dup=0;
        Arrays.sort(nums);
        while(i<nums.length)
        {
            if(nums[i]==nums[i+1])
            {
                dup=nums[i];
                break;
                
            }
            i++;
        }
        return dup;
    }
}