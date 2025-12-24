class Solution {
    public List<String> commonChars(String[] words) {
        int common[]= new int[26];
        int current[]= new int[26];
        ArrayList<String> al= new ArrayList<>();
        for(int i=0; i<words[0].length(); i++){
            common[words[0].charAt(i)-'a']++;
        }
        for(int i=1; i<words.length; i++){
            Arrays.fill(current,0);
            for(int j=0; j<words[i].length(); j++){
                current[words[i].charAt(j)-'a']++;
            }
            for(int z=0; z<26; z++){
                common[z]= Math.min(common[z],current[z]);
            }
        }
        for(int i=0; i<26; i++){
            for(int j=0; j<common[i]; j++){
                al.add(String.valueOf((char)(i+'a')));
            }
        }
        return al;
    }
}