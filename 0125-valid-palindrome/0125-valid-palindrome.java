class Solution {
    public boolean isPalindrome(String s) {
        String ls = s.toLowerCase();
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<s.length();i++){
            if((Character.isLetterOrDigit(ls.charAt(i)))){
                sb.append(ls.charAt(i));
            }
        }

        String newStr = sb.toString();


        int left=0;

        int right = (newStr.length())-1;

        while(left<right){
            if(newStr.charAt(left) != newStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;

        
    }
}