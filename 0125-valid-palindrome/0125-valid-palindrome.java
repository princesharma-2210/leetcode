class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || 
            (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || 
            (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {

                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}