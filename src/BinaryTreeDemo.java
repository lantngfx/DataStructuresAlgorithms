

public class BinaryTreeDemo {

	public static void main(String[] args) {
		/**
		 * 构造一棵二叉树
		 * */
		BinaryTreeNode root = new BinaryTreeNode(8);
		root.left = new BinaryTreeNode(6);
		root.right = new BinaryTreeNode(10);
		
		root.left.left = new BinaryTreeNode(5);
		root.left.right = new BinaryTreeNode(7);
		
		root.right.left = new BinaryTreeNode(9);
		root.right.right = new BinaryTreeNode(11);
		
		root.left.left.left = null;
		root.left.left.right = null;
		
		root.left.right.left = null;
		root.left.right.right = null;
		
		root.right.left.left = null;
		root.right.left.right = null;
		
		root.right.right.left = null;
		root.right.right.right = null;
		
		/**
		 * 先序遍历二叉树
		 * */
		printBinaryTree(root);
		System.out.println();
		/**
		 * 求出一棵二叉树的镜像
		 * 
		 * */
		BinaryTreeNode root1 = mirrorRecursively(root);
		printBinaryTree(root1);
		
	}

	private static BinaryTreeNode mirrorRecursively(BinaryTreeNode root) {
		if(root != null){
			BinaryTreeNode treeNode = null;
			//调换节点的左右节点
			treeNode = root.left;
			root.left = root.right;
			root.right = treeNode;
			root.left =  mirrorRecursively(root.left);
			root.right =  mirrorRecursively(root.right);
		}else{
			return null;
		}
		return root;
	}

	private static void printBinaryTree(BinaryTreeNode root) {
		if(root != null){
			
			System.out.print(root.value + "  ");
			printBinaryTree(root.left);
			printBinaryTree(root.right);
			
		}else{
			return;
		}
		
		
	}

}
/**
 * 
 *二叉树的节点类 
 * */
class BinaryTreeNode{
	public int value;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public BinaryTreeNode(int value) {
		super();
		this.value = value;
	}
	
	public BinaryTreeNode() {
		super();
	}
	
	
}
