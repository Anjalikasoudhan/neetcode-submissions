class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int totalwater=0;
        int l=0;
        int r=n-1;
        int lmax=0;
        int rmax=0;
        while(l<r){
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            if(height[l]<=height[r]){
                totalwater+=lmax-height[l];
                l++;
            }else{
                totalwater+=rmax-height[r];
                r--;
            }
        }
        return totalwater;
    }
}
