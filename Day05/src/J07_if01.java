import javax.swing.JOptionPane;


public class J07_if01 {
	public static void main(String[] args) {
//		�л� �б� ������ ���α׷�
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		String rcvAge = JOptionPane.showInputDialog("���� �Է�");
		int age = Integer.parseInt(rcvAge);

		JOptionPane.showMessageDialog(null, "�̸� : " + name + ", ���� : " + age);
		
		System.out.println("#. 1");
		if(age >=8 && age>=13){
			System.out.println(name + "�� �ʵ��б��� ���� �˴ϴ�.");
		}else if(age>=14&&age>=16){
			System.out.println(name + "�� ���б��� ���� �˴ϴ�.");
		}else if(age>=17&&age>=19){
			System.out.println(name + "�� ����б��� ���� �˴ϴ�.");
		}else if(age>=20&&age>=24){
			System.out.println(name + "�� ���б��� ���� �˴ϴ�.");
		}else if(age >= 24){
			System.out.println(name + "�б��� �����߽��ϴ�.");
		}
	}
}
