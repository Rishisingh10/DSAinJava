class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> a = new HashMap<>();

        a.put(0, 1);

        int prefix = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            prefix += nums[i];

            int rem = prefix % k;

            if (rem < 0) {
                rem += k;
            }

            if (a.containsKey(rem)) {
                count += a.get(rem);
            }

            a.put(rem, a.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}