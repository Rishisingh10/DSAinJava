class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> a = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            a.put(ch, a.getOrDefault(ch, 0) + 1);
        }

        int i = 0;

        for (int j = 0; j < s2.length(); j++) {

            char ch = s2.charAt(j);

            if (a.containsKey(ch)) {
                a.put(ch, a.get(ch) - 1);
            }

            if (j - i + 1 > s1.length()) {

                char left = s2.charAt(i);

                if (a.containsKey(left)) {
                    a.put(left, a.get(left) + 1);
                }

                i++;
            }

            if (j - i + 1 == s1.length()) {

                boolean found = true;

                for (int value : a.values()) {
                    if (value != 0) {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    return true;
                }
            }
        }

        return false;
    }
}