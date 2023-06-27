class Solution {
    public boolean isPalindrome(int begin,int end,String s) {
        // int begin=0;
        // int end=s.length()-1;
        while(begin<end){
            if(s.charAt(begin)!=s.charAt(end))
                return false;
            begin++;
                end--;
        }
        return true;
        
    }
    public boolean validPalindrome(String s) {
        int begin = 0,end = s.length() - 1;
        while(begin<end && s.charAt(begin)==s.charAt(end)){
            begin++;end--;
        }
        return isPalindrome(begin+1,end,s) || isPalindrome(begin,end-1,s);
}
}