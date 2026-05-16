class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=0;
        int l=0;
        for(int r=1;r<n;r++){
            if(prices[r]>prices[l]){
               int  profit=prices[r]-prices[l];
               maxprofit=Math.max(maxprofit,profit);
                
            }else{
                l=r;
            }
        }
        return maxprofit;
    }
}
