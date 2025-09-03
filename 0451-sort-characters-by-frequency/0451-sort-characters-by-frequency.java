class Solution {
    public String frequencySort(String s) {
        String st="";
        HashMap<Character,Integer> hm= new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> pq= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> result: hm.entrySet()){
            pq.offer(result);
        }
        while(!pq.isEmpty()){
            int time=pq.peek().getValue();
            for(int i=0; i<time; i++){
                st+= pq.peek().getKey();
            }
            pq.remove();
        }
        return st;
    }
}