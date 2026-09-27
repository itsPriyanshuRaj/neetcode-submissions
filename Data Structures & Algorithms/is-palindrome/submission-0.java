class Solution {

    public String rev(String s){
        
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString();
        
    }
    public boolean isPalindrome(String s) {
        
        
        StringBuilder clean = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                clean.append(Character.toLowerCase(ch));
            }

        }
        String original = clean.toString();
        String reverse = rev(original);

        return original.equals(reverse);
    }
}
