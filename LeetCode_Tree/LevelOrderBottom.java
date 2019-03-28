package LeetCode_Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {

	public static void main(String[] args) {
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
		//����������ڵ���list�еĸ���,�����һ��list
        if(level >= list.size()) {
            list.add(0,new LinkedList<Integer>());
        }
        levelMaker(list, root.left, level+1);
        levelMaker(list, root.right, level+1);
        //������list�з���LinkedList
        list.get(list.size()-level-1).add(root.val);
	}

	private static void preTra(TreeNode root) {
		if(root ==null)
			return;
		System.out.println(root.val);
		preTra(root.left);
		preTra(root.right);
		
	}

}
