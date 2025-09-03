class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        // int i=1;
        HashSet<Character> set= new HashSet<>();
        int startpoint=0;
        int endpoint=0;
        int n= s.length();
        while(endpoint<n){
            // if(s.charAt(i).equals(a)|| s.charAt(i).equals(b) || s.charAt(i).equals(c) || s.charAt(i).equals(d) || s.charAt(i).equals(e) || s.charAt(i).equals(f) || s.charAt(i).equals(g) || s.charAt(i).equals(h) || s.charAt(i).equals(i) || s.charAt(i).equals(j) || s.charAt(i).equals(k) || s.charAt(i).equals(l) || s.charAt(i).equals(m) || s.charAt(i).equals(n) || s.charAt(i).equals(o) || s.charAt(i).equals(p) || s.charAt(i).equals(q) || s.charAt(i).equals(r) || s.charAt(i).equals(s) || s.charAt(i).equals(t) || s.charAt(i).equals(u) || s.charAt(i).equals(v) || s.charAt(i).equals(w) || s.charAt(i).equals(x) || s.charAt(i).equals(y) || s.charAt(i).equals(z){
                // for(int j=0; j<i; j++){
                    if(set.contains(s.charAt(endpoint))){
                    // if(s.charAt(i)==s.charAt(j)){
                    //     count--;
                    //     break;
                    // }
                    while(startpoint<endpoint && set.contains(s.charAt(endpoint))){
                        set.remove(s.charAt(startpoint));
                        startpoint++;
                    }

                }
                set.add(s.charAt(endpoint));
                count =Math.max(count, (endpoint-startpoint+1));
                endpoint++;
            }
            return count;
    }
}