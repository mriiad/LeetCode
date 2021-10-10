/*
Write a function that reverses a string. The input string is given as an array of characters s.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/


// ###################################################
// ##                                               ##
// ##                   Solution                    ##
// ##                                               ##
// ###################################################
class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        char temp;
        while(i < s.length - i - 1){
            if(s[i] != s[s.length - i - 1]){
                temp = s[i];
                s[i] = s[s.length - i - 1];
                s[s.length - i - 1] = temp;
            }
            i++;
        }
    }
}




// Submissions:
/*
Runtime: 1 ms, faster than 95.94% of Java online submissions for Reverse String.
Memory Usage: 45.8 MB, less than 70.50% of Java online submissions for Reverse String.
*/
