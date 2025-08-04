class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        int i=0;
        int j=0;
        int result=0;
        int count=0;
        while(j!=fruits.length){
            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
            while(hm.size()>2){
                hm.put(fruits[i],hm.get(fruits[i])-1);
                if(hm.get(fruits[i])==0){
                    hm.remove(fruits[i]);
                }
                i++;
            }
            count= j-i+1;
            result= Math.max(result,count);
            j++;
        }
        return result;
    }
}