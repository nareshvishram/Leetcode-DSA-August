class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.pq=new PriorityQueue<>(k);
        this.k=k;
        for(int x:nums)
            add(x);
    }
    
    public int add(int val) {
        if(pq.size()<k)
            pq.offer(val);
        else if(pq.peek()<val){
            pq.poll();
            pq.offer(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */