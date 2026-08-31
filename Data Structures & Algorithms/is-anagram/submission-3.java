class Solution {
    public boolean isAnagram(String s, String t) {
        int slength=s.length();
        int llength=t.length();
        
        if(slength != llength){
            return false;
        }
         int [] count= new int[26];
         for(int i=0; i<slength; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
         }
         for(int value:count){
            if(value != 0){
                return false;
            }
         }
         return true;
    }
    
}
