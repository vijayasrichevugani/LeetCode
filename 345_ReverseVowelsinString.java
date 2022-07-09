class Solution {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int j=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                for(;j>=i;j--){
                    if(s.charAt(j)== 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u' || s.charAt(j) == 'A' || s.charAt(j) == 'E' || s.charAt(j) == 'I' || s.charAt(j) == 'O' || s.charAt(j) == 'U'){  
                        char temp = ch[i];
                        ch[i] = ch[j];
                        ch[j] = temp;
                        j--;
                        break;
                    }
                }
            }
        }
        return String.copyValueOf(ch);
    }
}
