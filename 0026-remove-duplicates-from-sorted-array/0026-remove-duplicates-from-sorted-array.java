class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
         if(n == 0){
            
             return 0;
        }
        
        int res = 1;

        for(int i = 1; i < n ; i++){
            
            if(nums[i] != nums[i-1]){
                        
                nums[res] = nums[i];
                res++;
            }
        }
        
        
        return res;
        // int res=1;
        // for(int i =1;i<n;i++){
        //     if(arr[i]!=arr[res-1]){
        //         arr[res] = arr[i];
        //         res++;
        //         }
        // }
        // return res;
        
    }
}