package Labs.Lab4;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        if(root.left == null && root.right == null){
            return root;
        }
        if(root.left != null){
            left = invertTree(root.left);
        }
        if(root.right != null){
            right = invertTree(root.right);
        }
        TreeNode x = left;
        left = right;
        right = x;
        return root;
    }    
}
