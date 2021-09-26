/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
*/



// ###################################################
// ##                                               ##
// ##                   Solution                    ##
// ##                                               ##
// ###################################################
class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int output[] = new int[nums.length];
        int i = nums.length - 1;
        while(i >= 0){
            if(Math.pow(nums[start], 2) > Math.pow(nums[end], 2)){
                output[i] = (int)Math.pow(nums[start], 2);
                start++;
            }else{
                output[i] = (int)Math.pow(nums[end], 2);
                end--;
            }
            i--;
        }
        return output;
    }
}

// Something better: credit to https://leetcode.com/Zaidzack/
// the key: comparing two values using 'abs' function instead of 'pow' which adds more complexity
/*
class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int [] output = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(Math.abs(nums[end]) < Math.abs(nums[start]))
            {
                output[i] = nums[start]*nums[start];
                start++;
            }
            else
            {
                output[i] = nums[end]*nums[end];
                end--;
            }
        }
        return output;
    }
}
*/

// Submissions:
/*
Runtime: 2 ms, faster than 66.75% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 41.2 MB, less than 45.51% of Java online submissions for Squares of a Sorted Array.
*/
