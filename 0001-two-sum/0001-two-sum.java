class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int res[]=new int[2];
        int index=0;
        for(int x:nums){
                int req=target-x;
                if(map.containsKey(req))
                {
                    res[0]=map.get(req);
                    res[1]=index;
                    return res;
                }
                else{
                    map.put(x,index);
                }
                index++;
            }
        
        return res;
    }
}