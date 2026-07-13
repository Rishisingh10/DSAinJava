class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> a = new HashMap<>();

        int i = 0;
        int max = 0;

        for (int j = 0; j < s.length(); j++) {

            a.put(s.charAt(j), a.getOrDefault(s.charAt(j), 0) + 1);

            while (a.get(s.charAt(j)) > 1) {

                a.put(s.charAt(i), a.get(s.charAt(i)) - 1);

                if (a.get(s.charAt(i)) == 0) {
                    a.remove(s.charAt(i));
                }

                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}