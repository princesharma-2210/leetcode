class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0; i<nums2.length; i++){
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i])>0){
                hm.put(nums2[i],hm.getOrDefault(nums2[i],0)-1);
                ans.add(nums2[i]);
            }
        }
        int result[]= new int[ans.size()];
        int j=0;  
        for(int val=0; val<ans.size(); val++){
            result[j++]= ans.get(val);
        }
        return result;
    }
}