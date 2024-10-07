import java.util.HashSet;
import java.util.Scanner;

//solution 1
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] b = new boolean[nums.length];
        for (int i : nums) {
            if (b[i]) return i;
            b[i] = true;
        }
        return -1;
    }
}


//solution-2
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution finder = new Solution();
        int result = finder.findDuplicate(nums);
        System.out.println("Output: " + result);
    }
}
