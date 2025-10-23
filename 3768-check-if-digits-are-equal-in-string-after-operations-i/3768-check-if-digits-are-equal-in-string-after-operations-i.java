// class Solution {
//     public boolean hasSameDigits(String s) {
//         String t="";
//         while(s.length()>2){
//             for(int i=0; i<s.length()-1; i++){
//                 int sum= (s.charAt(i)-'0')+(s.charAt(i+1)-'0');
//                 t=t+String.valueOf(sum % 10);
//             }
//             s=t;
//         }
//         if(s.charAt(0)==s.charAt(1)){
//             return true;
//         }
//         return false;
//     }
// }
class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder t = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int sum = (s.charAt(i) - '0') + (s.charAt(i + 1) - '0');
                t.append(sum % 10);
            }
            s = t.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}
