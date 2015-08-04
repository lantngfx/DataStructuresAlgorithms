

	public class ListDemo2 {
	
		public static void main(String[] args) {
			
			ListNode head = new ListNode(3);
			head.next = new ListNode(7);
			head.next.next = new ListNode(1);
			head.next.next.next = new ListNode(8);
			head.next.next.next.next = new ListNode(4);
			head.next.next.next.next.next = new ListNode(10);
			head.next.next.next.next.next.next = new ListNode(5);
			head.next.next.next.next.next.next.next = new ListNode(2);
			head.next.next.next.next.next.next.next.next = null;
			printList(head);
			System.out.println();
			theKValueOfTail(head,10);
			
		}
	
		private static void theKValueOfTail(ListNode head, int i) {
			/**
			 * ������Ϊ�գ��������ֵС�ڵ���0ʱֱ�ӷ���
			 * */
			if(head == null || i <= 0){
				System.out.println("����ֵ���Ϸ�");
				return ;
			}
			
			ListNode p1 = head;
			ListNode p2 = null;
			/**
			 * ��һ������ָ��˳����k���ڵ�
			 * */
			for(int n = 1;n <= i ; n++){
				if(p1 != null){
					p1 = p1.next;
				}else{
					System.out.println(i+" ���������ܳ��ȣ�����");
					return;
				}
			}
			p2 = head;
			while(p1 != null){
				p1 = p1.next;
				p2 = p2.next;
			}
			System.out.println("����ĵ�����"+i+"��ֵΪ��"+p2.value);
		}
	
		private static void printList(ListNode head) {
			
			while(head != null){
				System.out.print(head.value + "  ");
				head = head.next;
			}
			
		}
	
	}
	/**
	 * 
	 * �ڵ���
	 * */
	class ListNode2{
		
		public int value;
		public ListNode2 next;
		
		public ListNode2(int value) {
			super();
			this.value = value;
		}
	
		public ListNode2() {
			super();
		}
		
	}
