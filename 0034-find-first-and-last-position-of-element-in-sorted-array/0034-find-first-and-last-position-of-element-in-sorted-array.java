class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]= new int[2];
        int i=0;
        int j=nums.length-1;
        int start=-1;
        int end=-1;
        while(i<=j){
            int mid= (i+j)/2;
            if(nums[mid]== target){
                int left= mid-1;
                int right= mid+1;
                while(left>=0 && nums[left]==target ){
                    left--;
                }
                while(right<nums.length && nums[right]==target ){
                    right++;
                }
                start=left+1;
                end= right-1;
                break;
            }
            else if(nums[mid]>target){
                j= mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return new int[] {start,end};
    }
}