public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> solution = new ArrayList<>();
        if(root == null){
            return solution;
        }
        Queue<TreeNode> levels = new LinkedList<>();
        levels.offer(root);
        while (!levels.isEmpty()) {
            int levelSize = levels.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = levels.poll();
                currentLevel.add(node.val);
                if (node.left != null) {
                    levels.offer(node.left);
                }
                if (node.right != null) {
                    levels.offer(node.right);
                }
            }
            solution.add(currentLevel);
        }
        return solution;
    }
