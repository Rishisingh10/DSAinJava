class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> a = new HashMap<>();

        for (int k = 0; k < t.length(); k++) {
            char ch = t.charAt(k);
            a.put(ch, a.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int count = t.length();

        int min = Integer.MAX_VALUE;
        int start = 0;

        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j);

            if (a.containsKey(ch)) {

                if (a.get(ch) > 0)
                    count--;

                a.put(ch, a.get(ch) - 1);
            }

            while (count == 0) {

                if (j - i + 1 < min) {
                    min = j - i + 1;
                    start = i;
                }

                char left = s.charAt(i);

                if (a.containsKey(left)) {

                    a.put(left, a.get(left) + 1);

                    if (a.get(left) > 0)
                        count++;
                }

                i++;
            }
        }

        if (min == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + min);
    }
}