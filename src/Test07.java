

import java.util.Stack;

public class Test07 {  
    /** 
     * ������ջģ��Ķ��� 
     * ��������ʵ��һ�����С����е��������£���ʵ��������������appendTail��deleteHead�� 
     * �ֱ�����ڶ���β����������ڶ���ͷ��ɾ�����Ĺ��ܡ� 
     */  
    public static class MList<T> {  
        // ����ջ��ֻ���ڲ��������  
        private Stack<T> stack1 = new Stack<>();  
        // ����ջ��ֻ���ڵ�������  
        private Stack<T> stack2 = new Stack<>();  
  
        public MList() {  
        }  
          
        // ���Ӳ��������ڶ���β��������  
        public void appendTail(T t) {  
            stack1.add(t);  
        }  
  
        // ɾ���������ڶ���ͷ��ɾ�����  
        public T deleteHead() {  
  
            // ���жϵ���ջ�Ƿ�Ϊ�գ����Ϊ�վͽ�����ջ���������ݵ���ջ��  
            // ���ҽ�����������ѹ�뵯��ջ��  
            if (stack2.isEmpty()) {  
                while (!stack1.isEmpty()) {  
                    stack2.add(stack1.pop());  
                }  
            }  
  
            // �������ջ�л�û�����ݾ��׳��쳣  
            if (stack2.isEmpty()) {  
                throw new RuntimeException("No more element.");  
            }  
  
            // ���ص���ջ��ջ��Ԫ�أ���Ӧ�ľ��Ƕ���Ԫ�ء�  
            return stack2.pop();  
        }  
    }  
    public static void main(String[] args) {
    	MList<Integer> queue = new MList<Integer>();
    	queue.appendTail(5);
    	queue.appendTail(3);
    	queue.appendTail(7);
    	queue.appendTail(9);
    	queue.appendTail(2);
    	System.out.println(queue.deleteHead());
    	System.out.println(queue.deleteHead());
    	System.out.println(queue.deleteHead());
    	System.out.println(queue.deleteHead());
	}
}  