

public class ListDemo1{
	
	public static void main(String[] args) {
		/**
		 * 
		 * 构造链表
		 * 
		 * */
		ListNode1 head = new ListNode1(1);
		head.next = new ListNode1(2);
		head.next.next = new ListNode1(3);
		head.next.next.next = new ListNode1(4);
		head.next.next.next.next = new ListNode1(5);
		head.next.next.next.next.next = new ListNode1(6);
		head.next.next.next.next.next.next = new ListNode1(7);
		head.next.next.next.next.next.next.next = null;
		ListNode1 head2 = changeList(head);
		printList(head2);
	}
	/**
	 * 
	 * 打印链表
	 * */
	private static void printList(ListNode1 head2) {
		while(head2 != null){
			System.out.print(head2.value+"  ");
			head2 = head2.next;
		}
		
	}
	/**
	 * 
	 * 链表反转
	 * */
	private static ListNode1 changeList(ListNode1 head) {
		//当链表为空或只有一个元素时直接返回
		if(head == null || head.next == null){
			return head;
		}
		ListNode1 current = head.next;
		head.next = null;
		while(current != null){
			ListNode1 temp = current.next;
			current.next = head;
			head = current;
			current = temp;
		}
		return head;
	}
}
/**
 * 
 * 链表节点
 * */
class ListNode1 {
	public int value;
	public ListNode1 next;
	
	public ListNode1(int value) {
		super();
		this.value = value;
	}
	
	public ListNode1() {
		super();
	}
	
	
}
