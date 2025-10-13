class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> al= new ArrayList<>();
        String prev= "";
        for(int i=0; i<words.length; i++){
            char arr[]= words[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(!s.equals(prev)){
                al.add(words[i]);
                prev= s;
            }
        }
        return al;
    }
}