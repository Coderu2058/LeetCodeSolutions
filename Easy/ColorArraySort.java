//sorting array according to repeated elements [0,0,1,1,2,2].

import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public void sortColors(int[] nums) {
        int count0=0,count1=0,count2=0;
        for(int num :nums){
            if(num==0){
                count0++;
            }else if(num==1){
                count1++;
            }else{
                count2++;
            }
        }
        int index=0;
        while(count0>0){
           nums[index++]=0;
           count0--;
        }
        while(count1>0){
           nums[index++]=1;
           count1--;
        }
        while(count2>0){
           nums[index++]=2;
           count2--;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<=n;i++){
            nums[i]=sc.nextInt();
        }
        Solution sorting= new Solution();
        sorting.sortColors(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }
}

