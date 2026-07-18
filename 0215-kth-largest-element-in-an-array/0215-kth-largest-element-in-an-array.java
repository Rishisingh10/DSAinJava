class Solution {
    public int findKthLargest(int[] nums, int k) {

        int low = nums[0];
        int high = nums[0];

        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            for (int num : nums) {
                if (num >= mid) {
                    count++;
                }
            }

            if (count >= k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }
}