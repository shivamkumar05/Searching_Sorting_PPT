/*
Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 
Input: A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
Output: 4
Explanation: The frequency of 4 is 5 which is greater than half of the size of the array size.
 */

public class Q5 {
    public static void main(String[] args) {
        int A[]={3, 3, 4, 2, 4, 4, 2, 4, 4};

        //Using moore voting Algorithm
        //if there is majority element in array, it will always remain in lead

        int cnt =0;
        int ans =0;
        for(int i=0; i<A.length; i++){
            if(cnt ==0){
                ans = A[i];
            }

            if(A[i] == ans){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        System.out.println("The most frequent element is: "+ans);
    }
}
