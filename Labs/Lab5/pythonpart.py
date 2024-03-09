class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right
    def isValidBST(self, root):
        if root is None:
            return True
        leftMax = self.max_val(root.left)
        rightMin = self.min_val(root.right)
        if leftMax > root.val or rightMin < root.val:
            return False
        left = self.isValidBST(root.left)
        right = self.isValidBST(root.right)
        if left and right:
            return True
        else:
            return False
    def max_val(self, root):
        while root.right is not None:
            root = root.right
        return root.val
    def min_val(self, root):
        while root.left is not None:
            root = root.left
        return root.val







