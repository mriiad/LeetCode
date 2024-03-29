/**

Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.

Example 1:

Input: x = 121
Output: true
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:

Input: x = -101
Output: false
 

Constraints:

-231 <= x <= 231 - 1
*/
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        Stack<Integer> s1 = new Stack<>();
        int q = x;
        while(q > 0){
            s1.push(q % 10);
            q = q /10;
        }
        Stack<Integer> s2 = new Stack<>();
        int i = 0;
        int r;
        while(i < s1.size()){
            r = (int)Math.pow(10, s1.size() - i - 1);
            s2.push(x / r);
            x = x % r;
            i++;
        }
        while(!s1.empty()){
            if(s1.pop() != s2.pop()){
                return false;
            }
        }
        return true;
    }
}
