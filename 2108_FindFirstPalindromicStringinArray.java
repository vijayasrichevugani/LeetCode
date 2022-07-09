class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder input1 = new StringBuilder();
            input1.append(words[i]);
            if (words[i].equals(input1.reverse().toString())){
                return words[i];
            }
            else{
                continue;
            }
        }
        return "";
    }
}
