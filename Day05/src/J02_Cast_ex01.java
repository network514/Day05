
public class J02_Cast_ex01 {
	public static void main(String[] args) {
//		����ȯ�� �̿� : ��� ���ϱ�
		
		int kor = 76;
		int eng = 79;
		int math = 78;
		
		int sum = kor + eng + math;

		double avg= sum / 3;
//		=> ���� / ���� ��Ȳ���� / �����ڴ� �򿡸� ������ �ֱ� ������ �����θ� ���´�.
//		=> �׷��Ƿ�, ����� �����ε�, ������ double�� ����� ������ �Ҽ��� �ڸ��� .0���� ���´�.
		System.out.println("avg : " + avg);
//		=> �׷��Ƿ� ����Ŀ����� ����ȯ ��Ģ�� �̿��ؾ� �Ѵ�.
//		=> ���� / ���� ������ ������� �Ǽ�/���� �Ǵ� ����/�Ǽ� ������ ������� �ǵ��� �ؾ��Ѵ�.
		
		avg= (double)sum / 3;
		System.out.println("avg : " + avg);

		avg= sum / (double)3;		
		System.out.println("avg : " + avg);
	}
}
