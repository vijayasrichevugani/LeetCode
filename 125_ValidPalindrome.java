class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb=new StringBuilder(s); 
        sb = sb.reverse();
        if(s.equals(sb.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}
