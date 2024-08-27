class Solution {
    public int reverse(int x) {
        int sign=1;
        if(x<0)
            sign=-1;
        x=Math.abs(x);
        long num=0;
        while(x>0)
        {
            int rem=x%10;
            num=num*10+rem;
            x/=10;
            
        }
        num=num>Integer.MAX_VALUE?0:num;
        num*=sign;
        return (int)num;
    }
}