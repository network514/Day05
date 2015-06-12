
public class J04_Wrapper {
	public static void main(String[] args) {
		double d = 12.34;
		int i;
		i = (int)d;
//		=> 수치 데이터는 Cast를 통해 형변환이 가능하다.
		
		String s = "123";
//		int ss = (int)s; // 에러
//		=> String 형태의 데이터는 Cast 연산자로는 변환할 수 없다.
		
//		String 형태의 정수를 실제 일반형 정수 데이터로 변환하는 경우
//		- 형식 Integer.parseInt();
		
		String p1 = "123";
		int p2 = Integer.parseInt(p1);
		System.out.println("p2 : " + p2);
		System.out.println("p2 + 10 : " + (p2+10));
		
//		String 형태의 실수를 일반형 실수데이터로 변환하는 경우
//		- 형식 : Double.parseDouble();
		String k1 = "12.34";
		double k2 = Double.parseDouble(k1);
		System.out.println("k2 : " + k2);
		System.out.println("k2 + 10 : " + (k2+10));
		
	}
}
