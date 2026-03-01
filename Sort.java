public class Sort {
    public static void main(String[] args) {
       int []nums ={2,0,2,1,1,0};

       int l=0;int r=nums.length-1;int m=0;
       while(m<=r){
       if(nums[m]==0){
        int temp=nums[m];
        nums[m]=nums[l];
        nums[l]=temp;
        l++;
        m++;
       }
       else if(nums[m]==1){
        m++;
       }
       else if(nums[m]==2){
        int temp=nums[m];
        nums[m]=nums[r];
        nums[r]=temp;
        r--;
       }
        
       }
       for (int i = 0; i < nums.length; i++) {
        System.out.println(nums[i]);
       }
    }
}

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]