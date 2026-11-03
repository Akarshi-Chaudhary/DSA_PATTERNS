 class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null ) return ans;
        ans.add(root.val);
        ans.addAll(preorderTraversal(root.left));
        ans.addAll(preorderTraversal(root.right));
        return ans;
    }
}

class Solution{
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ans = new LinkedList<>();
        preorder(root, ans);
        return ans;
    }

    private static void preorder(TreeNode root, List<Integer>ans){
        if(root == null) return;
        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }
}
