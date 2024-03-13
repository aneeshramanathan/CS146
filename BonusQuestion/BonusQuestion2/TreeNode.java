package BonusQuestion.BonusQuestion2;

import org.w3c.dom.Node;

public class TreeNode{
    int data;
    TreeNode parent;
    TreeNode left;
    TreeNode right;
    boolean isRed;
    TreeNode(int data){
        this.data = data;
        left = null;
        parent = null;
        right = null;
    }

    public class RedBlackTree{
        private TreeNode root;
        public RedBlackTree(){
            root = null;
        }
        public boolean helperSearch(int key){
            return search(root, key) != null;
        }
        private TreeNode search(TreeNode node, int key){
            if(node == null || node.data == key){
                return node;
            }
            if(key < node.data){
                return search(node.left, key);
            }
            return search(node.right, key);
        }
        public void helperInsert(int key){
            root = insert(root, key);
            root.isRed = false;
        }
        private boolean isRed(TreeNode node){
            if(node == null){
                return false;
            }
            return node.isRed;
        }
        private TreeNode insert(TreeNode node, int key){
            if (node == null)
            return new TreeNode(key);
        if (key < node.data) {
            node.left = insert(node.left, key);
            node.left.parent = node;
        } else if (key > node.data) {
            node.right = insert(node.right, key);
            node.right.parent = node;
        }

        if (isRed(node.right) && !isRed(node.left))
            node = rotateLeft(node);
        if (isRed(node.left) && isRed(node.left.left))
            node = rotateRight(node);
        if (isRed(node.left) && isRed(node.right))
            flipColors(node);

        return node;
        }
        public void deleteHelper(int key) {
            root = delete(root, key);
            if (root != null)
                root.isRed = false; 
        }
        private TreeNode delete(TreeNode node, int key) {
            if (node == null)
                return null;
            if (key < node.data)
                node.left = delete(node.left, key);
            else if (key > node.data)
                node.right = delete(node.right, key);
            else {
                if (node.left == null)
                    return node.right;
                else if (node.right == null)
                    return node.left;
                else {
                    TreeNode successor = minimum(node.right);
                    node.data = successor.data;
                    node.right = delete(node.right, successor.data);
                }
            }
            if (isRed(node.left) && !isRed(node.right))
                node = rotateRight(node);
            if (isRed(node.right) && isRed(node.right.left))
                rotateRight(node.right);
            if (isRed(node.right) && isRed(node.left))
                flipColors(node);
            return node;
        }
        private TreeNode rotateLeft(TreeNode node) {
            TreeNode temp = node.right;
            node.right = temp.left;
            if (temp.left != null)
                temp.left.parent = node;
            temp.parent = node.parent;
            if (node.parent != null) {
                if (node == node.parent.left)
                    node.parent.left = temp;
                else
                    node.parent.right = temp;
            }
            temp.left = node;
            node.parent = temp;
            return temp;
        }
        private TreeNode rotateRight(TreeNode node) {
            TreeNode temp = node.left;
            node.left = temp.right;
            if (temp.right != null)
                temp.right.parent = node;
            temp.parent = node.parent;
            if (node.parent != null) {
                if (node == node.parent.right)
                    node.parent.right = temp;
                else
                    node.parent.left = temp;
            }
            temp.right = node;
            node.parent = temp;
            return temp;
        }
        private TreeNode minimum(TreeNode node) {
            while (node.left != null){
                node = node.left;
            } 
            return node;
        }
        private void flipColors(TreeNode node) {
            node.isRed = !node.isRed;
            node.left.isRed = !node.left.isRed;
            node.right.isRed = !node.right.isRed;
        }
    }
}
