package Labs.Lab5;

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

    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftMax = max(root.left);
        int rightMax = min(root.right);
        if(leftMax > root || rightMax < root){
            return false;
        }
        boolean left = isValidBST(root.left);
        boolean right = isValidBST(root.left);
        if(left == true && right == true){
            return true;
        }
        else{
            return false;
        }
    }
    public int max(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }
    public int min(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
 }
