

public class BinaryTreeDemo {

	public static void main(String[] args) {
		/**
		 * ����һ�ö�����
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
		 * �������������
		 * */
		printBinaryTree(root);
		System.out.println();
		/**
		 * ���һ�ö������ľ���
		 * 
		 * */
		BinaryTreeNode root1 = mirrorRecursively(root);
		printBinaryTree(root1);
		
	}

	private static BinaryTreeNode mirrorRecursively(BinaryTreeNode root) {
		if(root != null){
			BinaryTreeNode treeNode = null;
			//�����ڵ�����ҽڵ�
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
 *�������Ľڵ��� 
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
