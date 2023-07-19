/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 7
Output: 4

 */
public class Q4 {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 4;
        int low =0;
        int high = nums.length -1;

        int ans =0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if( nums[mid] == target){
                ans = mid;
                break;
            }
            else if(nums[mid] < target){
                low = mid+1;
                ans=low;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(ans);
}
}
