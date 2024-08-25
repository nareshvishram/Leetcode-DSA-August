class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,r=nums[n-1]-nums[0];
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            int cnt=getCnt(nums,k,mid);
            if(cnt>=k){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;   
    }
    int getCnt(int nums[],int k,int diff){
        int j=0,cnt=0;
        for(int i=0;i<nums.length;i++){
            while(j<nums.length && (nums[j]-nums[i]<=diff)){
                j++;
            }
            cnt+=(j-i-1);
        }
        return cnt;
    }
}