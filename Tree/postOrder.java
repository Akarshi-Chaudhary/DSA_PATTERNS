//addAll(...) adds every value from the list returned by a subtree call. add(...) adds one item

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        result.addAll(postorderTraversal(root.left));  // Visit left subtree
        result.addAll(postorderTraversal(root.right)); // Visit right subtree
        result.add(root.val);                          // Visit current node

        return result;
    }
}
