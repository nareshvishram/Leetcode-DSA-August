class Solution {
        public int rangeSum(int[] nums, int n, int left, int right) {
        long res = 0, min = Long.MAX_VALUE, mod = 1_000_000_007, sum = 0;
        List<Long> sums = new ArrayList<>(), pSum = new ArrayList<>(); 
        pSum.add(0L);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            pSum.add(sum);
            for (int j = 0; j < pSum.size() - 1; j++) sums.add(sum - pSum.get(j));
        }
        Collections.sort(sums);
        while (left <= right) res = (res + sums.get(left++ - 1)) % mod;
        return (int) res;
    }
}