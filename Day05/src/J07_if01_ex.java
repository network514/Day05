import javax.swing.JOptionPane;


public class J07_if01_ex {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		String rcvAge = JOptionPane.showInputDialog("���� �Է�");
		int age = Integer.parseInt(rcvAge);

		JOptionPane.showMessageDialog(null, "�̸� : " + name + ", ���� : " + age);
		
		if(age >=8 && age>=13){
			JOptionPane.showMessageDialog(null, name + "�� �ʵ��б��� ���� �˴ϴ�.");
		}else if(age>=14&&age>=16){
			JOptionPane.showMessageDialog(null, name + "�� ���б��� ���� �˴ϴ�.");
		}else if(age>=17&&age>=19){
			JOptionPane.showMessageDialog(null, name + "�� ����б��� ���� �˴ϴ�.");
		}else if(age>=20&&age>=24){
			JOptionPane.showMessageDialog(null, name + "�� ���б��� ���� �˴ϴ�.");
		}else if(age >= 24){
			JOptionPane.showMessageDialog(null, name + "�б��� �����߽��ϴ�.");
		}
	}
}
