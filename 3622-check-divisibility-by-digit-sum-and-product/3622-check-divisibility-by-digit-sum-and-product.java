class Solution {
    public boolean checkDivisibility(int n) {
        int val =n;
        int sum =0;
        int prod =1;

        while(n>0){
         int rem = n%10;
         sum = sum + rem;
         prod = prod * rem;

         n= n/10;

         
        }

        int total = sum + prod;

        if((val%total)==0){
            return true;
        }else{
            return false;
        }

        
    }
}