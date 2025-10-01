class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        HashMap<String,Boolean> hm= new HashMap<>();
        for(int i=0; i<wordList.size(); i++){
            hm.put(wordList.get(i),false);
        }
        int level=1;
        Queue<String> q= new LinkedList<>();
        q.add(beginWord);
        hm.put(beginWord,true);
        while(!q.isEmpty()){
            int len= q.size();
            for(int i=0; i<len; i++){
                String w= q.poll();
                if(w.equals(endWord)){
                    return level;
                }
                wordMatch(w,hm,q);
            }
            level++;
        }
        return 0;
    }
    public static void wordMatch(String w,HashMap<String,Boolean> hm, Queue<String> q){
        for(int i=0; i<w.length(); i++){
            char arr[]= w.toCharArray();
            for(int j=0; j<26; j++){
                arr[i]= (char)(j+'a');
                String s= String.valueOf(arr);
                if(hm.containsKey(s)&& hm.get(s)==false){
                    q.add(s);
                    hm.put(s,true);
                }
            }
        }
    }
}