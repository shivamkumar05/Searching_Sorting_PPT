/*
Given a 1-indexed array of integers numbers that are already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.
Return the indices of the two numbers, index1, and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.
Input: numbers = [2,7,11,15], target = 9

Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
*/

public class Q1{

    public static void twoSum (int []arr,int target){

        for(int i=0;i<arr.length; i++){
            int temp = target - arr[i];
            int low = i;
            int high = arr.length-1;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(temp == arr[mid]){
                   System.out.println(i+1);
                   System.out.println(mid+1);
                   break;
                }
                else if(temp < arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {2,7,11,15};
        int target = 9;

        System.out.println("The indices of the elements that add up to "+ target + " is :");
        twoSum(arr, target);
        
    }
}