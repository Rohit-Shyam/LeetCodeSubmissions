class Solution {
    public static Boolean check(HashMap <Character, Integer> hms, HashMap <Character, Integer> hmp){
        if(hms.size() != hmp.size()){
            return false;
        }
        for(char keys:hms.keySet()){
            if(!hmp.containsKey(keys)){
                return false;
            }
            int a = hms.get(keys);
            int b = hmp.get(keys);
            if( a != b){
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        HashMap <Character, Integer> hms = new HashMap <>();
        HashMap <Character, Integer> hmp = new HashMap <>();

        for(int i = 0; i<p.length(); i++){
            char ch = p.charAt(i);
            hmp.put(ch, hmp.getOrDefault(ch, 0)+1);
        }

        List <Integer> ans = new ArrayList <>();

        int l = 0;
        int n = s.length();
        int k = p.length();
        for(int r=0; r<n; r++){
            char ch = s.charAt(r);
            hms.put(ch, hms.getOrDefault(ch, 0)+1);

            if(r-l == k){
                char chl = s.charAt(l);
                hms.put(chl, hms.getOrDefault(chl, 0)-1);
                if(hms.get(chl) == 0){
                    hms.remove(chl);
                }
                l++;
            }

            if(r-l+1 == k){
                boolean valid = check(hms, hmp);
                if(valid){
                    ans.add(l);
                }
            }

        }
        return ans;
    }
}