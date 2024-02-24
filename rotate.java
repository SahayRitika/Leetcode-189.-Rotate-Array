class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        revNums(nums,0,n-1);
        revNums(nums,0,k-1);
        revNums(nums,k,n-1);
    }
    public void revNums(int[] nums,int start,int end){
        int temp;
        while(start<=end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
