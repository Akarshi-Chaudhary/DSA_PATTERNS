class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Nodes on the current level
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.remove();
                level.add(current.val); // Add this node to the current level

                // Queue children to visit on the next level
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            result.add(level); // Save this level
        }

        return result;
    }
}
