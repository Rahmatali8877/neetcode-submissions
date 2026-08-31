class Solution {
    public boolean isAnagram(String s, String t) {
        int slength=s.length();
        int llength=t.length();
        char [] arr= s.toCharArray();
        Arrays.sort(arr);
        char [] brr= t.toCharArray();
        Arrays.sort(brr);
        if(slength != llength){
            return false;
        }
         return Arrays.equals(arr, brr);
        
        

        

    }
}
