class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int inComming[]= new int[numCourses];
        int result[]= new int[numCourses];
        for(int i=0; i<prerequisites.length; i++){
            inComming[prerequisites[i][0]]++;
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(inComming[i]==0){
                q.add(i);
            }
        }
        int j=0;

        while(!q.isEmpty()){
            int val= q.remove();
            result[j]= val;
            j++;
            for(int i=0; i<prerequisites.length; i++){
                if(prerequisites[i][1]==val){
                    inComming[prerequisites[i][0]]--;
                
                if(inComming[prerequisites[i][0]]==0){
                    q.add(prerequisites[i][0]);
                }
                }
            }
        }
        if(j==numCourses){
        return result;
        }else{
            return new int[0];
        }
    }
}