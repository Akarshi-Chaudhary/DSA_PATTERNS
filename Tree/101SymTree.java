/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;

        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right){

        if(left == null && right == null) return true;

        if(left == null || right == null) return false;   

        if(left.val != right.val) return false;

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}

// iteratively --  Compare outer children (left.left with right.right) and inner children (left.right with right.left).

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();

        // Add the root's left and right children as a pair
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            // Remove the next pair of mirror nodes
            TreeNode left = queue.remove();
            TreeNode right = queue.remove();

            // Two missing nodes are symmetric
            if (left == null && right == null) continue;

            // Only one missing node means they are not symmetric
            if (left == null || right == null) return false;

            // Mirror nodes must have equal values
            if (left.val != right.val) return false;

            // Add outer children as a pair
            queue.add(left.left);
            queue.add(right.right);

            // Add inner children as a pair
            queue.add(left.right);
            queue.add(right.left);
        }

        // All mirror pairs matched
        return true;
    }
}
