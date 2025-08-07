class Solution {
    static void permutation(int[] nums,int idx, List<List<Integer>> result){
        if(idx==nums.length){
            List<Integer> current = new ArrayList<>();
            for(int num : nums) {
                current.add(num);
            }
            if(!result.contains(current)){
            result.add(current);
            }
            return;
        }
        for(int i=idx; i<nums.length; i++){
            swap(nums,i,idx);
            permutation(nums,idx+1,result);
            swap(nums,i,idx);
        }
    } 
    static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
          Arrays.sort(nums); 
        permutation(nums,0,result);
        return result;
    }
}