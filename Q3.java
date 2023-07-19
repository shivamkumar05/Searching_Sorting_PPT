/*
A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time.
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
 */

public class Q3 {
    public static void main(String[] args) {
        int nums[] = {1,2,1,3,5,6,4};

        int low =0;
        int high = nums.length -1;

        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[mid-1] && nums[mid]>nums[mid+1])
            {
                System.out.println("Peak element is: "+mid);
                break;
            }
            else if(nums[mid] < nums[mid+1]  ){
                //it means arr[mid]<arr[mid+1]  so ans will defenetly arr[mid+1] or in right part
                //that'a why srt=mid+1;
                low = mid+1;
            }
            else{
                //it means arr[mid]>arr[mid+1] , we are in decending part and might be this will ans
                //but also chnce that ans will be in left part that's why end =mid
                high = mid;
            }

        }

    }
}
