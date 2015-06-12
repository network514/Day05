
public class J03_Quiz {

	public static void main(String[] args) {
//		문제 : 각 번호에 맞는 프로그램 작성
//		1. 1~200까지의 랜덤 정수 값을 변수에 저장하고 출력
		int mr = (int) (Math.random()*200+1);
		
		System.out.println("1번 : " + mr);
//		2. 1번 변수의 값에 10을 나눈 후 몫에 결과를 출력
		
		System.out.println("2번 : " + mr/10);
//		3. 1번 변수의 값에 10을 나눈 후 나머지의 결과를 출력
		
		System.out.println("3번 : " + mr%10);
//		4. 1번 변수의 값에 15를 나눈 후 나머지의 결과 값이 0인지 아닌지를 출력
		
		boolean bool = (mr%15) == 0;
		System.out.println("4번의 결과는 " + bool);
		if(mr%15 == 0){
			System.out.println("4번 : 0이다.");
		}else{
			System.out.println("4번 : 0이 아니다.");
		}
		
//		5. 1번 변수 40을 더한 후 다시 저장하여 출력
		mr += 40;
		System.out.println("5번 : " + mr);
		
//		6. 1번 변수의 값이 80이상 ~ 150미만의 값인지, 아닌지를 출력
		boolean bool2 = (mr>=80) && (mr<150);
		System.out.println("6번 : " + bool2);
		if(mr>=80 && mr<150){
			System.out.println("6번 : 1번 변수의 값이 80이상 ~ 150미만의 값이 맞음");
		}else{
			System.out.println("6번 : 1번 변수의 값이 80이상 ~ 150미만의 값이 아님");

		}
	}

}
