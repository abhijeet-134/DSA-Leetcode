class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        for(int i=0; i<n; i++) {
            HashSet<Character> charSet = new HashSet<>();
            for(int j=i; j<n; j++) {
                if(charSet.contains(s.charAt(j))) {
                    break;
                }
                charSet.add(s.charAt(j));
                maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }
}