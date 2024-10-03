import java.util.HashSet;
class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int sl = 3; 
        int l = 0;
        String temp = "";
        int ans = 0;
        for (int r = 0; r < n; r++) {
            temp = temp + s.charAt(r); 
            if (r - l == sl) {
                temp = temp.substring(1); 
                l++; 
            }
            if (r - l + 1 == sl) { 
                if (hasUniqueCharacters(temp)) { 
                    ans++; 
                }
            }
        }
        return ans;
    }
    public static boolean hasUniqueCharacters(String str) {
        HashSet<Character> charSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!charSet.add(str.charAt(i))) {
                return false; 
            }
        }
        return true; 
    }
}