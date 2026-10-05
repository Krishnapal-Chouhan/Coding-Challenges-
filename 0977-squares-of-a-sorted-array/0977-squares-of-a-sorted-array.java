class Solution {
    public int[] sortedSquares(int[] nums) {
        int bp=nums.length;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>=0){
                bp = i;
                break;
            }
        }

        for(int f=0;f<nums.length;f++){
            nums[f]= nums[f]* nums[f];
        }

        int j=bp-1;
        int k = bp;
        int newarr[] = new int [nums.length];
        int m =0;

        while(j>=0 && k<nums.length){
            if(nums[j]>=nums[k]){
                newarr[m++] = nums[k];
                k++; 
            }else if (nums[j]< nums[k]){
                newarr[m++]= nums[j];
                j--;
            }
        }

        while(j>=0){
            newarr[m++] = nums[j--];
        }

        while(k<nums.length){
            newarr[m++] = nums[k++];
        }



    return newarr;



    }
}