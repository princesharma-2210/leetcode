class Solution {
    public int fib(int n) {
        int first=0;
        int second=1;
        for(int i=0; i<n; i++){
            int next= first+second;
            first= second;
            second= next;
        }
        return first;
    }
}