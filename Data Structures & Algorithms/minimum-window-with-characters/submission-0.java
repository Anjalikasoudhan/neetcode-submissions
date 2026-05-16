class Solution {
    public String minWindow(String s, String t) {
        int minlen=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isValid(sub,t)){
                    if(sub.length()<minlen){
                        minlen=sub.length();
                        ans=sub;
                    }
                }
            }
        }
        return ans;
    }
    public boolean isValid(String sub,String t){
        int[] freq=new int[128];
        for(char ch:sub.toCharArray()){
            freq[ch]++;
        }
        for(char ch:t.toCharArray()){
            if(freq[ch]==0){
                return false;
            }
            freq[ch]--;
        }
        return true;
    }
}
