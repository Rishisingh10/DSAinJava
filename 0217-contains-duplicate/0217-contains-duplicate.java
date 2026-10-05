import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>a=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(a.add(nums[i])==false){
                return true;
            }
        }return false;
       
}
}