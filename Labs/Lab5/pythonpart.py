class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

    def isValidBST(self, root):
        if root is None:
            return True
        if root.left is not None and root.left.val > root.right.val:
            return False
        if root.right is not None and root.left.val < root.right.val:
            return False
        left = self.isValidBST(root.left)
        right = self.isValidBST(root.left)
        if left == True and right == True:
            return True
        else:
            return False


