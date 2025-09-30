// class Solution {
//     public static int recursion(int newnums[], int len, int[] nums){
//         if(len==0){
//             return newnums[0];
//         }
//         nums[newnums.length-len-1]= newnums[newnums.length-len-1]+newnums[newnums.length-len];
//         recursion(newnums,len-1,nums);
//         return
//     }
//     public int triangularSum(int[] nums) {
//         int val=nums[0];
//         for(int i=0; i<nums.length; i++){
//             int newnums[]= new int[nums.length-i];
//             for(int j=0; j<nums.length-i;i++){
//                 newnums[j]= nums[j];
//             }
//             val= recursion(newnums,nums.length-i-1,nums);
//         }
//         return val;
//     }
// }

class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        for (int len = n; len > 1; len--) {
            for (int i = 0; i < len - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }
        return nums[0];
    }
}
