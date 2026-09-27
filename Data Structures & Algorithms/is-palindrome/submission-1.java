class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int low = 0;
        int high = s.length()-1;
        boolean flag = true;

        while(low < high) {

            if(s.charAt(low) != s.charAt(high)) {
                flag = false;
                break;
            }
            low++;
            high--;
        }

        return flag;
    }
}
