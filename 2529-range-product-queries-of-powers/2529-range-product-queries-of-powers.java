class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> power= new ArrayList<Integer>();
        int result[]= new int[queries.length];
        for(int i=0; i<32; i++){
            if((n & (1<<i))!=0){
                power.add(1<<i);
            }
        }
        long product=1;
        for(int i=0; i<queries.length; i++){
            product=1;
            int left= queries[i][0];
            int right= queries[i][1];
            for(int j=left; j<=right; j++){
                product= (power.get(j)*product)%1000000007;
            }
            result[i]= (int)product;
        }
        return result;
    }
}