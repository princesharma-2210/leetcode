class Solution {
    public int findShortestCycle(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> al= new ArrayList<>();
        for(int i=0; i<n; i++){
            al.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            al.get(edges[i][0]).add(edges[i][1]);
            al.get(edges[i][1]).add(edges[i][0]);
        }
        int ans= Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            Queue<Integer> q= new LinkedList<>();
            q.add(i);
            int[] parent= new int[n];
            int[] dst= new int[n];
            Arrays.fill(parent,-1);
            Arrays.fill(dst,-1);
            dst[i]=0;
            while(!q.isEmpty()){
                int rem=q.poll();
                for(int j=0; j<al.get(rem).size(); j++){
                    if(dst[al.get(rem).get(j)]==-1){
                        dst[al.get(rem).get(j)]= dst[rem]+1;
                        parent[al.get(rem).get(j)]= rem;
                        q.add(al.get(rem).get(j));
                    }
                    else if(parent[rem]!=al.get(rem).get(j)){
                        ans= Math.min(ans,dst[rem]+dst[al.get(rem).get(j)]+1);
                    }
                }
            }

        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}