
public class Casting {

	public static void main(String[] args) {

		double a = 1.1;
		double b = 1; // �ս��� ���� ������ auto casting �̶�� �����ȴ� 
		double b2 = (double) 1; 
		System.out.println(b); //1.0
		
	//	int c = 1.1;  0.1�� �Ҿ�����Ƿ� �� ���·� �� �� ����
		double d = 1.1; // change d from int to double
		int e = (int) 1.1; // Add cast to int ������ integer �� �ٲٰڴ�
		System.out.println(e); //1.1 > 1 �ս� �Ͼ�� 
		
		// 1 to String 
		String f = Integer.toString(1); // �˻� ���� �ȴ�. 
		System.out.println(f.getClass());  // � data type ���� �˷��ִ� code getClass()
		
	}

}
