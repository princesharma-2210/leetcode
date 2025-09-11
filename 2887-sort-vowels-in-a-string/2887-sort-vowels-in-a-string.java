class Solution {
    public String sortVowels(String s) {
        StringBuilder sb= new StringBuilder();
        ArrayList<Character> al= new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='u'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='a'||s.charAt(i)=='U'||s.charAt(i)=='O'||s.charAt(i)=='I'||s.charAt(i)=='E'||s.charAt(i)=='A'){
                al.add(s.charAt(i));
            }
        }
        Collections.sort(al);
        int idx=0;
        for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='u'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='a'||s.charAt(i)=='U'||s.charAt(i)=='O'||s.charAt(i)=='I'||s.charAt(i)=='E'||s.charAt(i)=='A'){
                sb.append(al.get(idx));
                idx++;

            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}