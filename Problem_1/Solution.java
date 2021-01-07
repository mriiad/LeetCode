/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original.equals(target)){
            return cloned;
        }else{
            TreeNode clonedTarget = null;
            if(original.left != null){
                clonedTarget = getTargetCopy(original.left, cloned.left, target);
            }
            // If the clonedTarget is found in the left branch -> no need to search in the right branch
            if(clonedTarget != null){
                return clonedTarget;
            }else{
                if(original.right != null){
                    return getTargetCopy(original.right, cloned.right, target);
                }
            }
        }
        return null;
    }
}
