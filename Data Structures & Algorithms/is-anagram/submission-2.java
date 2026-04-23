class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length()){
        return false;
     }
     int chararr[] = new int[26];
     for(int i=0;i<s.length();i++){
        chararr[s.charAt(i)-'a']++;
         chararr[t.charAt(i)-'a']--;
     }
     for(int i:chararr){
        if(i!=0){
            return false;
        }
     }
     return true;
    }
}
