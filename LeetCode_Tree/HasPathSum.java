public boolean hasPathSum(TreeNode root, int sum) {
    // 创建两个栈,一个用于存储树节点,一个用于存储节点的累加值
    if (root == null) {return false;}
    Stack<TreeNode> path = new Stack<>();
    Stack<Integer> sub = new Stack<>();
    path.push(root);
    sub.push(root.val);
    while (!path.isEmpty()) {
        TreeNode temp = path.pop();
        int tempVal = sub.pop();
        //到达叶子节点,判断是否满足条件
        if (temp.left == null && temp.right == null) {if (tempVal == sum) return true;}
        else {
        //否则继续添加节点
            if (temp.left != null) {
                path.push(temp.left);
                sub.push(temp.left.val + tempVal);
            }
            if (temp.right != null) {
                path.push(temp.right);
                sub.push(temp.right.val + tempVal);
            }
        }
    }
    return false;
}
