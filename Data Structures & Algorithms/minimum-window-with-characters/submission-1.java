class Solution {
    public String minWindow(String s, String t) {
        int minlen=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int start=-1;
        int winstr=0;
        int winend=0;
        int req=map.size();
        int N=s.length();
        while(winend<N){
            char ch=s.charAt(winend);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                req--;
                }
            }
            while(req==0){
                int len=winend-winstr+1;
                if(len<minlen){
                    minlen=len;
                    start=winstr;
                }
                 ch=s.charAt(winstr);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                    if(map.get(ch)>0){
                        req++;
                    }
                }
                winstr++;
            }
           winend++;
        }
        if(start==-1){
            return "";
        }
        return s.substring(start,start+minlen);

    }
}
