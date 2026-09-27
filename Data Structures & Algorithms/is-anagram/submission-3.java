class Solution {

    public String sort(String s){
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    char temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        return new String(arr);
    }

    public boolean isAnagram(String s, String t) {

        // boolean flag = false;
        String str = sort(s);
        String str1 =sort(t);
        // return str.equals(str1);
        if (str.length() != str1.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str1.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
