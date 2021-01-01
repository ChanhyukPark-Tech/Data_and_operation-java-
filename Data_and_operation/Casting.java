
public class Casting {

	public static void main(String[] args) {

		double a = 1.1;
		double b = 1; // 손실이 없기 때문에 auto casting 이라고 봐도된다 
		double b2 = (double) 1; 
		System.out.println(b); //1.0
		
	//	int c = 1.1;  0.1을 잃어버리므로 이 상태로 할 수 없다
		double d = 1.1; // change d from int to double
		int e = (int) 1.1; // Add cast to int 강제로 integer 로 바꾸겠다
		System.out.println(e); //1.1 > 1 손실 일어난다 
		
		// 1 to String 
		String f = Integer.toString(1); // 검색 통해 안다. 
		System.out.println(f.getClass());  // 어떤 data type 인지 알려주는 code getClass()
		
	}

}
