class Solution {
    public boolean isPalindrome(String s) {
        String ls = s.toLowerCase();
        int left =0;
        int right = ls.length()-1;

        while(left < right){
            while(left <right && !(Character.isLetterOrDigit(ls.charAt(left)))){
                left++;
            }

            while(left <right && !(Character.isLetterOrDigit(ls.charAt(right)))){
                right--;
            }

            if(ls.charAt(left)!= ls.charAt(right)){
                return false;
            }

            left++;
            right--;


        }

        return true;
    }
}