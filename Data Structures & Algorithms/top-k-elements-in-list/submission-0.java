class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            int maxElement=-1;
            int maxFreq=-1;
            for(int key:map.keySet()){
                if(map.get(key)>maxFreq){
                    maxElement=key;
                    maxFreq=map.get(key);
                }
            }
            ans[i]=maxElement;
            map.remove(maxElement);
        }
        return ans;
    }
}
