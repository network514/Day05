
public class J02_Cast_ex01 {
	public static void main(String[] args) {
//		형변환의 이용 : 평균 구하기
		
		int kor = 76;
		int eng = 79;
		int math = 78;
		
		int sum = kor + eng + math;

		double avg= sum / 3;
//		=> 정수 / 정수 상황에서 / 연산자는 몫에만 관심이 있기 때문에 정수로만 나온다.
//		=> 그러므로, 결과가 정수인데, 변수를 double로 만들면 무조건 소수점 자리가 .0으로 나온다.
		System.out.println("avg : " + avg);
//		=> 그러므로 연산식에서의 형변환 규칙을 이용해야 한다.
//		=> 정수 / 정수 형태의 연산식을 실수/정수 또는 정수/실수 형태의 연산식이 되도록 해야한다.
		
		avg= (double)sum / 3;
		System.out.println("avg : " + avg);

		avg= sum / (double)3;		
		System.out.println("avg : " + avg);
	}
}
