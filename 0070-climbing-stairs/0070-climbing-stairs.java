class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int first=2;
        int second=3;
        int next=0;
        for(int i=3; i<n; i++){
            next=first+second;
            first= second;
            second= next;
        }
        return next;
    }
}