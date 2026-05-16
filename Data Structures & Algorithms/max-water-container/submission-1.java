class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        int n=heights.length;
        int l=0;int r=n-1;
       while(l<r){
              int width=r-l;
              int h=Math.min(heights[l],heights[r]);
              int area=width*h;
              maxArea=Math.max(maxArea,area);
              if(heights[l]<heights[r]){
                l++;
              }else{
                r--;
              }
            
        }
        return maxArea;
    }
}
