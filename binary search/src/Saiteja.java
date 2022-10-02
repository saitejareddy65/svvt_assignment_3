
public class Saiteja {

    public int search(int[] nums,int target_number){
        if (nums.length==0) {
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        int midpoint=0;
        //Iterative Algorithm
        while(left<=right){
            midpoint=left+(right-left)/2;
            if(nums[midpoint]==target_number){
                return midpoint;
            }

            else if (nums[midpoint]>target_number){
                right=midpoint-1;

            }
            else{
                left=midpoint+1;
            }
        }
        return -1;
    }
}