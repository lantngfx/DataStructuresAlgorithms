

public class ListDmeo3 {

	public static void main(String[] args) {
		ListNode3 head = new ListNode3(4);
		head.next = new ListNode3(11);
		head.next.next = new ListNode3(6);
		head.next.next.next = new ListNode3(2);
		head.next.next.next.next = new ListNode3(43);
		head.next.next.next.next.next = new ListNode3(13);
		head.next.next.next.next.next.next = new ListNode3(9);
		head.next.next.next.next.next.next.next = new ListNode3(5);
		head.next.next.next.next.next.next.next.next = new ListNode3(8);
		head.next.next.next.next.next.next.next.next.next = null;
		
		printList(head);
		System.out.println();
		ListNode3 node = new ListNode3(8);
		
		head = deleteNode(head,node);
		
		printList(head);
	}

	private static ListNode3 deleteNode(ListNode3 head, ListNode3 node) {
		/**
		 * 当链表为空或删除的节点为空时，直接返回链表
		 * 
		 * */
		if(head == null || node == null){
			System.out.println("没有删除的节点！！！");
			return head;
		}
		/**
		 * 
		 * 当删除的是第一个时
		 * */
		if(head.value == node.value){
			System.out.println(node.value+"被删除了！！！");
			head = head.next;
			return head;
		}
		/**
		 * 当删除的节点不为第一个时
		 * */
		ListNode3 head1 = head.next;
		/**
		 * 保留被删除的节点的前一个节点
		 * */
		ListNode3 head2 = head;
		while(head1 != null){
			if(head1.value == node.value){
				head2.next = head1.next;
				System.out.println(node.value+"被删除了！！！");
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		return head;
	}
/**
 * 打印链表
 * 
 * */
	private static void printList(ListNode3 head) {
		
		while(head != null){
			System.out.print(head.value + "  ");
			head = head.next;
		}
		
	}

}
/**
 * 
 * 节点类
 * */
class ListNode3{
	
	public int value;
	public ListNode3 next;
	
	public ListNode3(int value){
		this.value = value;
	}
	
	public ListNode3(){}
}
