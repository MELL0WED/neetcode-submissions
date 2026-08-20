class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            int res[] = new int[26];

            for(char c: s.toCharArray()){
                res[c - 'a']++;
            }

            String key = Arrays.toString(res);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

    return new ArrayList<>(map.values());

    }
}
