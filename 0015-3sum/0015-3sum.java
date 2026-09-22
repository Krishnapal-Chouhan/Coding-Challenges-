class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;


Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

       
        
        for(int i=0;i<n-2;i++){
             
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int result = -1 * nums[i];

            int left = i+1;
            int right =  n-1;


            while(left<right){
                 int sum = nums[left] + nums[right];
                      
                if(sum == result){
                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);


                    ans.add(temp);

                  
                

                    // Skip duplicate left values
                    while(left < right &&
                          nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while(left < right &&
                          nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }



               
              

               else if(sum >result){
                    right--;
                }else if(sum < result){
                    left++;
                }


                
            }


        }

        return ans;
    }
}