class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int temp[]= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            temp[nums[i]]= temp[nums[i]]+1;
        }
        int arr[]= new int[2];
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(temp[i]==2){
                arr[j]=i;
                j++;
            }
        }
        return arr;
    }
}