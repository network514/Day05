
public class J04_Wrapper {
	public static void main(String[] args) {
		double d = 12.34;
		int i;
		i = (int)d;
//		=> ��ġ �����ʹ� Cast�� ���� ����ȯ�� �����ϴ�.
		
		String s = "123";
//		int ss = (int)s; // ����
//		=> String ������ �����ʹ� Cast �����ڷδ� ��ȯ�� �� ����.
		
//		String ������ ������ ���� �Ϲ��� ���� �����ͷ� ��ȯ�ϴ� ���
//		- ���� Integer.parseInt();
		
		String p1 = "123";
		int p2 = Integer.parseInt(p1);
		System.out.println("p2 : " + p2);
		System.out.println("p2 + 10 : " + (p2+10));
		
//		String ������ �Ǽ��� �Ϲ��� �Ǽ������ͷ� ��ȯ�ϴ� ���
//		- ���� : Double.parseDouble();
		String k1 = "12.34";
		double k2 = Double.parseDouble(k1);
		System.out.println("k2 : " + k2);
		System.out.println("k2 + 10 : " + (k2+10));
		
	}
}
