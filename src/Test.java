

public class Test {

	public static void main(String[] args) {

		// 构造数一
		BinaryTreeNode1 tree1 = new BinaryTreeNode1(8);
		tree1.left = new BinaryTreeNode1(8);
		tree1.right = new BinaryTreeNode1(7);

		tree1.right.left = null;
		tree1.right.right = null;

		tree1.left.left = new BinaryTreeNode1(9);
		tree1.left.right = new BinaryTreeNode1(2);

		tree1.left.left.left = null;
		tree1.left.left.right = null;

		tree1.left.right.left = new BinaryTreeNode1(4);
		tree1.left.right.right = new BinaryTreeNode1(7);

		tree1.left.right.left.left = null;
		tree1.left.right.left.right = null;

		// 构造数2
		BinaryTreeNode1 tree2 = new BinaryTreeNode1(8);

		tree2.left = new BinaryTreeNode1(9);
		tree2.right = new BinaryTreeNode1(2);

		tree2.left.left = null;
		tree2.left.right = null;

		tree2.right.left = null;
		tree2.right.right = null;

		boolean flag = isSubTree(tree1,tree2);
		System.out.println(flag);
	}

	@SuppressWarnings("unused")
	private static boolean isSubTree(BinaryTreeNode1 tree1, BinaryTreeNode1 tree2) {
		boolean flag = false;
		if (tree1 != null && tree2 != null) {
			if (tree1.value == tree2.value) {
				flag = DoesTree1HasTree2(tree1, tree2);
			}
			
			if(!flag){
				flag = isSubTree(tree1.left,tree2);
			}
			
			if(!flag){
				flag = isSubTree(tree1.right,tree2);
			}
		}

		return flag;
	}

	private static boolean DoesTree1HasTree2(BinaryTreeNode1 tree1,
			BinaryTreeNode1 tree2) {
		if(tree2 == null){
			return true;
		}
		if(tree1 == null){
			return false;
		}
		if(tree1.value != tree2.value){
			return false;
		}
		return DoesTree1HasTree2(tree1.left,tree2.left)&&DoesTree1HasTree2(tree1.right,tree2.right);
	}
}

class BinaryTreeNode1 {
	public int value;
	public BinaryTreeNode1 left;
	public BinaryTreeNode1 right;

	public BinaryTreeNode1(int value) {
		super();
		this.value = value;
	}

	public BinaryTreeNode1() {
		super();
	}

}
