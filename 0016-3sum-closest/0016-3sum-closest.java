class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int result = 0;
         int mini_diff = Integer.MAX_VALUE; 
         Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            int first =  nums[i];

            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum = first + nums[left] +  nums[right];
               
                int diff = Math.abs(target - sum);
                

                if(mini_diff > diff){
                    mini_diff = diff;
                    result = sum;

                }

                if(target== sum){
                    return sum;
                }

                 else if(sum> target){
                    right--;
                }else{
                    left++;
                }


            }

          
        }
          return result;
    }
}