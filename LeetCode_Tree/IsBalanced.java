/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        //递归结束条件
        if(root == null)//递到叶子节点,返回true
            return true;
        //判断是否满足平衡二叉树的条件.不满足则跳出
        if(Math.abs(depth(root.left)-depth(root.right))>1)//
            return false;
        //判断完主节点,然后分别判断左右子树
        return isBalanced(root.left)&&isBalanced(root.right);
        
    }
    //求二叉树深度的递归函数
    public int depth(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
}
