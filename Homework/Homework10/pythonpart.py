def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        solution = []
        if root is None:
            return solution
        levels = []
        levels.append(root)
        while levels:
            levelSize = len(levels)
            currentLevel = []
            for i in range(levelSize):
                node = levels.pop(0)
                currentLevel.append(node.val)
                if node.left:
                    levels.append(node.left)
                if node.right:
                    levels.append(node.right)
            solution.append(currentLevel)
        return solution
