class Solution {
    public int[] sortedSquares(int[] nums) {
        int bp =nums.length;
        int newarr[] = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                bp = i;
                break;
            }
        }

        for(int j=0;j<nums.length;j++){
            nums[j] = nums[j] * nums[j];
        }



       int i = bp-1;
       int j = bp;
       int k=0;

       while(i>=0 && j<nums.length){

        if(nums[i]<=nums[j]){
            newarr[k++] = nums[i];
            i--;
        }else{
            newarr[k++] = nums[j];
            j++;
        }

       }

       while(i>=0){
        newarr[k++] = nums[i];
        i--;
       }

       while(j<nums.length){
        newarr[k++] = nums[j];
        j++;
       }

       return newarr;

    }
}