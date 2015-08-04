

public class ArrayDemo {

	public static void main(String[] args) {
		int[] ints1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		System.out.println("����ǰ��˳��:");
		printArray(ints1);
		int[] ints2 = sortArray(ints1);
		System.out.println("�������˳��:");
		printArray(ints2);
	}

	private static int[] sortArray(int[] ints1) {
		int p1 = 0;
		int p2 = ints1.length - 1;
		boolean flag1 = false;
		boolean flag2 = false;
		
		while(p1 <= p2){
			//Ϊż��ʱ����ͣ
			if(ints1[p1]%2 == 1){
				p1++;
			}else{
				flag1 = true;
			}
			//Ϊ����ʱ����ͣ
			if(ints1[p2]%2 == 0){
				p2--;
			}else{
				flag2 = true;
			}
			/**
			 * p1λ��Ϊż����p2λ��Ϊ�����ǽ�����λ��
			 * */
			if(flag1 && flag2){
				int temp = ints1[p1];
				ints1[p1] = ints1[p2];
				ints1[p2] = temp;
				flag1 = false;
				flag2 = false;
			}
			
		}
		return ints1;
	}
	/**
	 * 
	 * ��ӡ����
	 * */
	private static void printArray(int[] ints) {
		for(int i = 0;i < ints.length;i++){
			System.out.print(ints[i] + " ");
		}
		System.out.println();
	}

}
