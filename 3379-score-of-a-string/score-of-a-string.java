class Solution {
    public int scoreOfString(String s) {
        int temp = 0;
        for(int i =0; i<s.length() - 1;i++){
            int a = Math.abs(s.charAt(i) - s.charAt(i+1));
            temp = temp + a;
        }
        return temp;
    }
}