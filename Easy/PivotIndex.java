package Easy;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums)); 
    }
    public static int pivotIndex(int[] nums) {
        int l_sum=0;
        int r_sum=0;
        int n=nums.length;
        if(nums == null || n == 0) return -1;
        for(int i: nums){
            r_sum += i;
        }
        for(int i=0;i<n;i++){
            r_sum -= nums[i];
            if(l_sum == r_sum) return i;
            l_sum += nums[i];
        }
        return -1;
    }
}