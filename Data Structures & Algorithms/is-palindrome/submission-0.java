class Solution {
    public boolean isPalindrome(String s) {
     int i=0;
     int j=s.length()-1;
     if(s.isEmpty()|| s.length()==1){
        return true;
     }
     while(i<j){
        while(i<j&& !Character.isLetterOrDigit(s.charAt(i))){
            i++;
        }
        while(i<j&& !Character.isLetterOrDigit(s.charAt(j))){
            j--;
        }
        char leftchar=Character.toLowerCase(s.charAt(i));
        char rightchar=Character.toLowerCase(s.charAt(j));
         if(leftchar!=rightchar){
            return false;
         }
        i++;j--;
     }
     return true;
    }
}
