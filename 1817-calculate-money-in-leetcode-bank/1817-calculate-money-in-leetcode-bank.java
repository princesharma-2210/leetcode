class Solution {
    public int totalMoney(int n) {
        int mon= 1;
        int out=0;
        while(n>0){
            for(int i=0; i<Math.min(n,7); i++){
                out+= mon+i;
            }
            n-=7;
            mon++;
        }
        return out;
    }
}