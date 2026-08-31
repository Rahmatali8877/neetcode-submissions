class Solution {
    public boolean isAnagram(String s, String t) {
        int slength=s.length();
        int llength=t.length();
        
        if(slength != llength){
            return false;
        }
         HashMap<Character,Integer> sCount= new HashMap();
         HashMap<Character,Integer> tCount=new HashMap();
        for( int i=0; i<slength; i++){
            sCount.put(s.charAt(i), 
                     sCount.getOrDefault(s.charAt(i), 0) +1);
            tCount.put(t.charAt(i),
                    tCount.getOrDefault(t.charAt(i), 0) +1);
        }
    return sCount.equals(tCount);
    }
    
}
