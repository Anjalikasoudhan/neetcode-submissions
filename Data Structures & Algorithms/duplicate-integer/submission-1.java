class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
          int n=nums.length;
          int i=0;
          boolean flag=false;
          for(int j=1;j<n;j++){
            if(nums[j]==nums[i]){
              flag=true;
              break;
            }
            i++;
          }
        return flag;
    }
}