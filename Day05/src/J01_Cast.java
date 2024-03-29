
public class J01_Cast {
	public static void main(String[] args) {
//		자료형 변환 : 자동형변환, 강제형변환(Caste)
//		1. 자동형변환
//		- 다음과 같은 관계에서 자동형변환이 일어남
//		- int < long < float < double
//		우측의 형태를 가진 변수 공간에는
//		좌측의 형태 데이터 값을 자동으로 저장할 수 있음
		
		long l;
		l = 10;
//		=> 대입 연산자로 저장할 때에는 반드시 양 쪽의 형태가 같아야만 한다.
		
		l = 10;
//		=> 그러나, 위와 같은 관계에서 좌측에 있는 자료형은 우측에 있는 자료형으로
//		자동으로 변환되는 특성이 있다. 
//		=> 오른쪽에 저장하려는 int 형태 값인 10이 자동으로 공간의 형태로 변환되어 10L이 되고,
//		이러한 과정을 자동형변환이라고 한다.
		
//		2. 강제형변환
//		- Cast 연산자를 사용하여 프로그래머의 의도대로 강제적으로 형변환을 할 수 있다.
		
		double d = 12.34;
		int i;
		
//		i = d; // 에러
//		=> 일반형 실수를 일반형 정수 공간에 저장할 수 없다.
		
		i = (int)d;
//		=> 일반형 실수 값인 d를 일반형 정수 형태 int로 변환하겠다는 의미
		
		long p;
		p = 10;
		p = (long)10;
//		=> 자동형변환은 자바 프로그램이 스스로 위와 같은 형변환 작업을 처리한다.
		
		System.out.println("i : " + i);
	}
}