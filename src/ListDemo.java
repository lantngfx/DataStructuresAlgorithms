

public class ListDemo {

	public static void main(String[] args) {
		/**
		 * 
		 * ��������һ
		 * */
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(3);
		head1.next.next = new ListNode(5);
		head1.next.next.next = new ListNode(7);
		head1.next.next.next.next = new ListNode(9);
		head1.next.next.next.next.next = new ListNode(11);
		head1.next.next.next.next.next.next = null;
		/**
		 * 
		 * ���������
		 * */
		ListNode head2 = new ListNode(2);
		head2.next = new ListNode(4);
		head2.next.next = new ListNode(6);
		head2.next.next.next = new ListNode(7);
		head2.next.next.next.next = new ListNode(8);
		head2.next.next.next.next.next = null;

		printList(head1);
		System.out.println();
		printList(head2);
		ListNode head3 = merge(head1, head2);
		System.out.println();
		printList(head3);
	}

	private static ListNode merge(ListNode head1, ListNode head2) {
		/**
		 * ��head1Ϊ��ʱ��ֱ�ӷ���head2���ӵ���һ���ڵ�ͺ�
		 * */
		if (head1 == null) {
			return head2;
		}
		/**
		 * ��head2Ϊ��ʱ��ֱ�ӷ���head1���ӵ���һ���ڵ�ͺ�
		 * */
		if (head2 == null) {
			return head1;
		}
		ListNode head = null;
		if (head1.value <= head2.value) {
			// ��head1.value��Сʱ��˵��head1��Ϊͷ�ڵ㷵��
			head = head1;
			head.next = merge(head1.next, head2);
		} else {
			// ��head1.value��Сʱ��˵��head1��Ϊͷ�ڵ㷵��
			head = head2;
			head.next = merge(head1, head2.next);
		}
		return head;
	}

	private static void printList(ListNode head1) {

		while (head1 != null) {
			System.out.print(head1.value + "  ");
			head1 = head1.next;
		}
	}

}

/**
 * 
 * ����Ľڵ���
 * */
class ListNode {
	public int value;
	public ListNode next;

	public ListNode(int value) {
		super();
		this.value = value;
	}

	public ListNode() {
		super();
	}
}
