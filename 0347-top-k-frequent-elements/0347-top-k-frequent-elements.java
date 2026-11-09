class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();

            if (minHeap.size() < k) {
                minHeap.offer(new int[]{freq, num});
            }
            else if (freq > minHeap.peek()[0]) {
                minHeap.poll();
                minHeap.offer(new int[]{freq, num});
            }
        }

        
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll()[1];
        }

        return result;
    }
}
