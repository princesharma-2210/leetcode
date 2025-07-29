class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0; i<t.length(); i++){
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1);
        }
        int i=0;
        int j=0;
        int count_Required=t.length();
        int minWindowSize=Integer.MAX_VALUE;
        int start_index=0;
        while(j<s.length()){
            if(hm.containsKey(s.charAt(j))){
                if(hm.get(s.charAt(j))>0){
                    count_Required--;
                }
                hm.put(s.charAt(j),hm.get(s.charAt(j))-1);
            }
            
            while(count_Required==0){
                int curWindowSize= (j-i)+1;
                if(minWindowSize>curWindowSize){
                    minWindowSize= curWindowSize;
                    start_index= i;
                }
                if(hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
                if(hm.get(s.charAt(i))>0){
                    count_Required++;
                }
                }
                i++;
            }
            j++;
        }
        return minWindowSize== Integer.MAX_VALUE? "": s.substring(start_index,start_index+minWindowSize);
    }
}