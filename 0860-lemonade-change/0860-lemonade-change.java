class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for(int x:bills)
        {
            if(x==5)
            {
                five++;
            }
            else if(x==10)
            {
                five--;
                ten++;
            }
            else if(x==20 && ten>0)
            {
             ten--;
             five--;
             }
            else
                five=five-3;
            if(five<0)
                return false;
        }
        return true;
    }
}