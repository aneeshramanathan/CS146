def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root is None:
            return root
        self.invertTree(root.left)
        self.invertTree(root.right)
        x = root.left
        root.left = root.right
        root.right = x
        return root
