class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> list=new HashMap<>();
        for(String s:strs){
           char[] arr=  s.toCharArray();
           Arrays.sort(arr);
           String sortedS=new String(arr);
           list.putIfAbsent(sortedS, new ArrayList<>());
           list.get(sortedS).add(s);
        }
        return new ArrayList<>(list.values());
    }
}
