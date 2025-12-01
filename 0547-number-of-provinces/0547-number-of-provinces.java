class Solution {
    public static void dfsUtils(int val, boolean isVisited[], ArrayList<ArrayList<Integer>> al){
        if(isVisited[val]==true){
            return;
        }
        isVisited[val]=true;
        for(int i=0; i<al.get(val).size(); i++){
            if(isVisited[al.get(val).get(i)]!=true){
                dfsUtils(al.get(val).get(i),isVisited, al);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>(isConnected.length);
        int count=0;
        for (int i = 0; i < isConnected.length; i++) {
            al.add(new ArrayList<Integer>());
        }
        for(int i=0; i<isConnected.length;i++){
            for(int j=0; j<isConnected[0].length; j++){
                if(isConnected[i][j]==1 && i!=j){
                    al.get(i).add(j);
                }
            }
        }
        boolean isVisted[]= new boolean[isConnected.length];
        for(int i=0; i<isConnected.length; i++){
            
            if(isVisted[i]==false){
                count++;
                dfsUtils(i,isVisted,al);
            }
        }
        return count;
    }
}