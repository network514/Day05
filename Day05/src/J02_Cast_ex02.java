
public class J02_Cast_ex02 {

	public static void main(String[] args) {
//		����(������ ��) �ڵ� �����ϱ�
//		- �ڹٰ� �����ϴ� ���� �� ���� ���
//		- ���� : Math.random();
//		- �����ϴ� �� : 0.0 �̻� ~ 1.0 �̸�
//		- �����Ǵ� ���� : double��
		
		 double rm= Math.random();
		 System.out.println("rm : " + rm);
		 
//		 ���� �������� �ʿ��� ���
		 int rcv1 = (int)Math.random();
		 System.out.println("rcv1 : " + rcv1);
//		 => �����Ǵ� ���� ��� 1���� ���� �� �̹Ƿ� int�� Cast�ϸ� ������ 0�� ���´�.
		 
//		 10���� ���� ������ �ʿ��� ���
		 int rcv2 = (int) (Math.random()*10);
		 System.out.println("rcv2 : " + rcv2);
		 
//		 1~10�� ������ �ʿ��� ��� 
		 int rcv3 = (int) (Math.random()*10 + 1);
		 System.out.println("rcv3 : " + rcv3);
//	
//		 
//		 
//		 
	}

}
