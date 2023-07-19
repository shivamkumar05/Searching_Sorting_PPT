/*
Given an array of integer nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If the target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args)
    {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;

        int low =0;
        int high = nums.length -1;

        int ans[] = new int[]{-1,-1};
        int first =-1;
        int second = -1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(target == nums[mid]){
                first = mid;
                if(nums[mid-1]< target){
                    second = mid+1;
                    break;
                }
                else{
                    second = mid-1;
                    break;
                }
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else {
                high=mid-1;
            }
        }

        if(first<second){
            ans[0]=first;
            ans[1]=second;
        }
        else{
            ans[0] = second;
            ans[1] = first;
        }

        System.out.println(Arrays.toString(ans));

    }
}
