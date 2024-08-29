class Solution {
    public boolean isPalindrome(int x) {
        String s=x+"";
      
      int i=0,j=s.length()-1;
      
      while(j>=i)
      {
        if(s.charAt(i)!=s.charAt(j))
          return false;
        i++;
        j--;
      }
      return true;
    }
}