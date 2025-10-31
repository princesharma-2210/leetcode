class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int temp[]= new int[nums.length+1];
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            temp[nums[i]]++;
        }
        for(int i=1; i<= nums.length; i++){
            if(temp[i]==0){
                al.add(i);
            }
        }
        return al;
    }
}