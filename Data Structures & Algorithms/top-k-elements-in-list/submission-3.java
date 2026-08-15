class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //creating a hashmap to store the freq of each int
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        //creating a bucket arraylist for storing arraylist based on freq counts

        int n = nums.length;
        ArrayList<Integer>[] bucket = new ArrayList[n+1];

        for(int num:map.keySet()){
            int freq = map.get(num);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        int count = 0;
        int []result = new int[k];

        for(int freq=n; freq>=0; freq--){
            if(bucket[freq]!=null){
                for(int num:bucket[freq]){
                    result[count] = num;
                    count++;
                    if(count==k){
                        return result;
                    }
                }
            }
        }

        return result;

    }
}
