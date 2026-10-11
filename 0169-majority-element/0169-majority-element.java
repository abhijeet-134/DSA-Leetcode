class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int frequency = 1;
        int ans = nums[0];

        if(frequency > nums.length/2) {
            return ans;
        }

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                frequency++;
            }else {
                frequency = 1;
                ans = nums[i];
            }

            if(frequency > nums.length/2) {
                return ans;
            }
        }
        return -1;
    }
}