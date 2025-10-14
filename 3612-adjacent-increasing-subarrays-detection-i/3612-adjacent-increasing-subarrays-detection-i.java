// class Solution {
//     public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
//         if(nums.size()<k){
//             return false;
//         }
//         if(k==1 && nums.size()>1){
//             return true;
//         }
//         int subArray=0;
//         int i=0;
//         while(i<=nums.size()-k){
//             boolean increment=true;
//             for(int j=i; j<i+k-1; j++){
//                 if(nums.get(j)>=nums.get(j+1)){
//                     increment=false;
//                     break;
//                 }    
//             }
//             if(increment){
//                 subArray++;
//                 if(subArray==2){
//                     return true;
//                 }
//                 i+=k;
//             }else{
//                 i=i+1;
//             }
//         }
//         return false;
//     }
// }
class Solution {

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int cnt = 1;
        int precnt = 0;
        int ans = 0;

        for (int i = 1; i < n; ++i) {
            if (nums.get(i) > nums.get(i - 1)) {
                ++cnt;
            } else {
                precnt = cnt;
                cnt = 1;
            }
            ans = Math.max(ans, Math.min(precnt, cnt));
            ans = Math.max(ans, cnt / 2);
        }

        return ans >= k;
    }
}