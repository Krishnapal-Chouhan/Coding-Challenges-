class Solution {
    public int countCommas(int n) {
        int On = n;
       int length = String.valueOf(n).length();
        if(length>3){
            return On-999;
        }else{
            return 0;
        }
    }
}