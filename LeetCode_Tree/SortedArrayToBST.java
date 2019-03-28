package LeetCode_Tree;

public class SortedArrayToBST {

	public static void main(String[] args) {
		int nums[] = {-10,-3,0,5,9};
		TreeNode root = sortedArrayToBST(nums);
		//前序遍历二叉树
		preTra(root);
	}

	private static void preTra(TreeNode root) {
		if(root ==null)
			return;
		System.out.println(root.val);
		preTra(root.left);
		preTra(root.right);
		
	}

	private static TreeNode sortedArrayToBST(int[] nums) {
		// 采取二分法的思想进行平衡二叉树的组合
		//将nums的中间位作为root点
		int low = 0;
		int high = nums.length-1;
		int mid = (low +high)/2;
		TreeNode root = toBST(low,high,nums);
		return root;
	}

	private static TreeNode toBST(int low, int high, int[] nums) {
		if(high<low)
			return null ;
		int mid = (low+high)/2;
		TreeNode root = new TreeNode(nums[mid]);
        //分别平衡左右子树
		root.left = toBST(low,mid-1,nums);
		root.right = toBST(mid+1,high,nums);
        //将主节点返回
		return root;
	}

}
