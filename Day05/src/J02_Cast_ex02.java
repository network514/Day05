
public class J02_Cast_ex02 {

	public static void main(String[] args) {
//		난수(임의의 수) 자동 추출하기
//		- 자바가 제공하는 랜덤 값 제공 기능
//		- 형식 : Math.random();
//		- 제공하는 값 : 0.0 이상 ~ 1.0 미만
//		- 제공되는 형태 : double형
		
		 double rm= Math.random();
		 System.out.println("rm : " + rm);
		 
//		 정수 랜덤값이 필요한 경우
		 int rcv1 = (int)Math.random();
		 System.out.println("rcv1 : " + rcv1);
//		 => 제공되는 값이 모두 1보다 작은 수 이므로 int로 Cast하면 무조건 0이 나온다.
		 
//		 10보다 작은 정수가 필요한 경우
		 int rcv2 = (int) (Math.random()*10);
		 System.out.println("rcv2 : " + rcv2);
		 
//		 1~10의 정수가 필요한 경우 
		 int rcv3 = (int) (Math.random()*10 + 1);
		 System.out.println("rcv3 : " + rcv3);
//	
//		 
//		 
//		 
	}

}
