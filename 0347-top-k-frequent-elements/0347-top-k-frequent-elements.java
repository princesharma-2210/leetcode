class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        int arr[]= new int[k];
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> result: hm.entrySet()){
            pq.add(result);
        }

        int i=0;
        while(k>0){
            arr[i]=pq.remove().getKey();
            k--;
            i++;
        }
        return arr;
    }
}