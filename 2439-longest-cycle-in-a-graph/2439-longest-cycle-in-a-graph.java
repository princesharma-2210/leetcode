class Solution {
    public int longestCycle(int[] edges) {
        int vis[]= new int[edges.length];
        int longest=-1;
        for(int i=0; i<edges.length; i++){
            int curr= i;
            HashMap<Integer,Integer> hm= new HashMap<>();
            int size=1;
            if(vis[curr]==1){
                continue;
            }
            while(edges[curr]!=-1){
                if(hm.containsKey(curr)){
                    longest= Math.max(longest,size-hm.get(curr));
                    
                }
                if(vis[curr]==1){
                    break;
                }
                vis[curr]=1;
                hm.put(curr,size++);
                curr= edges[curr];
                
            }
        }
        return longest;
    }
}