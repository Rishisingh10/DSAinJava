class Solution {
    public int searchInsert(int[] nums, int target) {
    int end= nums.length-1;
    int start=0;
    while(start<=end)
    {
        int mid =start+((end-start)/2);
        if (nums[mid]<target)
        {
            start=mid+1;
        }
        else if (nums[mid]>target)
        {
            end=mid-1;
        }
        else 
        {
            return mid;
        }

    }
    if(end==0&& nums[end]>target){
        return 0;
    }else if(end==nums.length){
        return nums.length-1;
    }else{
        return start;
    }
    }
        
    }
