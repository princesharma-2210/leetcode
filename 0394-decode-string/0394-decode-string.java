class Solution {
    public String decodeString(String s) {
        Stack<String> stStr= new Stack<>();
        Stack<Integer> stNum= new Stack<>();
        StringBuilder currString= new StringBuilder("");
        int currNumber=0;
        // int prevNumber= 0;
        // String prevString= "";
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                currNumber= currNumber*10+ s.charAt(i)-'0';
            }
            else if(s.charAt(i)=='['){
                stStr.push(currString.toString());
                stNum.push(currNumber);
                currNumber=0;
                currString=new StringBuilder("");
            }
            else if(s.charAt(i)==']'){
                int prevNumber=stNum.pop();
                StringBuilder prevString= new StringBuilder(stStr.pop());
                for(int j=0; j<prevNumber; j++){
                    prevString.append(currString);
                }
                currString= prevString;
            }
            
            else {
                currString.append(s.charAt(i));
            }
            
        }
        return currString.toString();
    }
}