class Solution {
    public void sortColors(int[] nums) {

        int freq[] = new int [3];
        
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int k=0;

        for(int j=0;j<freq.length;j++){
            while(freq[j]>0){
                nums[k++] =j;
                freq[j]--;
            }
        }

       
    }
}