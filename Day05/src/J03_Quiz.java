
public class J03_Quiz {

	public static void main(String[] args) {
//		���� : �� ��ȣ�� �´� ���α׷� �ۼ�
//		1. 1~200������ ���� ���� ���� ������ �����ϰ� ���
		int mr = (int) (Math.random()*200+1);
		
		System.out.println("1�� : " + mr);
//		2. 1�� ������ ���� 10�� ���� �� �� ����� ���
		
		System.out.println("2�� : " + mr/10);
//		3. 1�� ������ ���� 10�� ���� �� �������� ����� ���
		
		System.out.println("3�� : " + mr%10);
//		4. 1�� ������ ���� 15�� ���� �� �������� ��� ���� 0���� �ƴ����� ���
		
		boolean bool = (mr%15) == 0;
		System.out.println("4���� ����� " + bool);
		if(mr%15 == 0){
			System.out.println("4�� : 0�̴�.");
		}else{
			System.out.println("4�� : 0�� �ƴϴ�.");
		}
		
//		5. 1�� ���� 40�� ���� �� �ٽ� �����Ͽ� ���
		mr += 40;
		System.out.println("5�� : " + mr);
		
//		6. 1�� ������ ���� 80�̻� ~ 150�̸��� ������, �ƴ����� ���
		boolean bool2 = (mr>=80) && (mr<150);
		System.out.println("6�� : " + bool2);
		if(mr>=80 && mr<150){
			System.out.println("6�� : 1�� ������ ���� 80�̻� ~ 150�̸��� ���� ����");
		}else{
			System.out.println("6�� : 1�� ������ ���� 80�̻� ~ 150�̸��� ���� �ƴ�");

		}
	}

}
