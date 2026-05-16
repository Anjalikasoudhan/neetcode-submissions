class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str :strs){
            int[] freq=new int[26];
            for(char ch:str.toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder key=new StringBuilder();
            for(int cnt:freq){
                key.append(cnt).append("#");
            }
            String finalKey=key.toString();
            if(!map.containsKey(finalKey)){
                map.put(finalKey,new ArrayList<>());
            }
            map.get(finalKey).add(str);
            
        }
        return new ArrayList<>(map.values());
    }
}
