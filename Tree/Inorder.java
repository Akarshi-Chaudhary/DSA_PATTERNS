//Recursive inorder
  
class Solution {
    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);          // Visit left subtree
        System.out.print(root.val + " "); // Visit current node
        inorder(root.right);         // Visit right subtree
    }
}

and  Yes, this is a correct recursive inorder traversal. It visits left → root → right and returns the values in a list.

  
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return list; // Empty subtree

        list.addAll(inorderTraversal(root.left)); // Visit left subtree
        list.add(root.val);                       // Visit current node
        list.addAll(inorderTraversal(root.right));// Visit right subtree

        return list;
    }
}

//iterative

class Solution {
    public void inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Go as far left as possible, saving nodes to visit later
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Visit the next saved node
            current = stack.pop();
            System.out.print(current.val + " ");

            // Then visit its right subtree
            current = current.right;
        }
    }
}
