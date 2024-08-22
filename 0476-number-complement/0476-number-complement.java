class Solution {
    public int findComplement(int num) {
        int ans=~num&(Integer.highestOneBit(num)-1);
        return ans;
    }
}