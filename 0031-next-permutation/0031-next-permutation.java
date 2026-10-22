class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                pivot = i;
                break;
            }
        }

        if(pivot == -1) {
            int k = 0;
            int l = n-1;

            while(k < l) {
                int temp = nums[k];
                nums[k] = nums[l];
                nums[l] = temp;
                k++;
                l--;
            }
            return;
        }

        for(int i=n-1; i>pivot; i--) {
            if(nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        int k = pivot + 1;
        int l = n-1;
        while(k < l) {
            int temp = nums[k];
            nums[k] = nums[l];
            nums[l] = temp;
            k++;
            l--;
        }
    }
}