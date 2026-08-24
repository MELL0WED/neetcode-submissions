class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for(int s: stones){
            maxHeap.offer(-s);
        }

        while(maxHeap.size() > 1){
            int first = maxHeap.poll();
            int sec = maxHeap.poll();

            if(first != sec){
                maxHeap.offer(first - sec);
            }

        }

        if(maxHeap.isEmpty()){
            return 0;
        }

        return -maxHeap.peek();
    }
}
