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
        if(root.left != null && root.left.val > root.right.val){
            return false;
        }
        if(root.right != null && root.left.val < root.right.val){
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
 }
