import javax.swing.JOptionPane;


public class J06_Joption02 {
	public static void main(String[] args) {
//		Joption�� �̿��ؼ� ������ ������ �Է�-����ϼ���.
//		�̸�, ����, Ű ���...
//		1. �Է� : �̸�, ����, Ű ���...
//		2. �Է� ���� ���� ��� ��
//		3. ���� 15�� �� ���̰� ������� ���
		String rsv1 = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
		String rsv2 = JOptionPane.showInputDialog("���̸� �Է��ϼ���.");
		String rsv3 = JOptionPane.showInputDialog("���� �Է��ϼ���.");
		String rsv4 = JOptionPane.showInputDialog("�߻���� �Է��ϼ���.");
		int num1 = Integer.parseInt(rsv2);
		int num2 = Integer.parseInt(rsv4);
		String showMsg = "���� �̸� : " + rsv1 + "\n";
		JOptionPane.showMessageDialog(null, showMsg);
		JOptionPane.showMessageDialog(null, "���̴� " + rsv2);
		JOptionPane.showMessageDialog(null, "10�� �� ���̴� " + (num1+10) + "��");
		JOptionPane.showMessageDialog(null, "������ " + rsv3);
		JOptionPane.showMessageDialog(null, "�߻������ " + num2 + "cm");
	}
}
