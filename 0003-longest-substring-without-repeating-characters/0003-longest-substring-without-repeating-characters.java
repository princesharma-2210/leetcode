class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxWindow=0;
        int start=0;
        int end=0;
        for(int i=1; i<s.length(); i++){
            start= end;
            while(start<i){
                if(s.charAt(start)==s.charAt(i)){
                    end=start+1;
                    break;
                }
                start++;
            }
            maxWindow= Math.max(maxWindow,i-end+1);
        }
        maxWindow= Math.max(maxWindow,s.length()-end);
        return maxWindow;
    }
}