class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> s=new HashSet<>();
        for(int n :nums){
            s.add(n);
        }

        int longestsub=1;
        for(int i :s){
            if(s.contains(i-1)){
                continue;
            }
            else{
                int currentnumb=i;
                int currentsub=1;
                while(s.contains(currentnumb+1)){
                    currentnumb++;
                    currentsub++;
                }
                longestsub=Math.max(longestsub,currentsub);
            }
        }
        return longestsub;
    }
}
