class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>>ans=new HashMap<>();
       for(String s:strs){
        int c1[]=new int[26];
        for(char c:s.toCharArray()){
            c1[c-'a']++;
        }
        String key=Arrays.toString(c1);
         if(!ans.containsKey(key)){
            ans.put(key,new ArrayList<>());
         }
         ans.get(key).add(s);
       } 
       return new ArrayList<>(ans.values());
    }
}
