package LeetCode_Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {

	public static void main(String[] args) {
		//将简单的二叉树建立好
		TreeNode root = new TreeNode(3);
		TreeNode left = new TreeNode(9);
		TreeNode right = new TreeNode(20);
		root.left = left;
		root.right = right;
		right.left = new TreeNode(15);
		right.right = new TreeNode(7);
		List<List<Integer>> list =  levelOrderBottom(root);
		System.out.println(list);

	}

	private static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
         	levelMaker(wrapList, root, 0);
        	return wrapList;
	}
	private static void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
		if(root == null) return;
		//如果层数大于等于list中的个数,就添加一个list
		if(level >= list.size()) {
		    list.add(0,new LinkedList<Integer>());
		}
		levelMaker(list, root.left, level+1);
		levelMaker(list, root.right, level+1);
		//反向在list中放置LinkedList
		list.get(list.size()-level-1).add(root.val);
	}
}
