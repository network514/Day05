import javax.swing.JOptionPane;

public class J05_Joption01 {

	public static void main(String[] args) {
		String msg = "�����ְ� ���� ����";
		System.out.println(msg);
		
		JOptionPane.showMessageDialog(null, msg);
//		=> �����ְ� ���� �޽����� gui������ ���� ������
//		=> �Ұ�ȣ ������ �⺻������, null�� ����ϰ� ���� �޽����� �Է��Ѵ�.
		JOptionPane.showMessageDialog(null, "��������");
		JOptionPane.showMessageDialog(null, 1872638912);
		JOptionPane.showMessageDialog(null, 123431.14144564534343444);
//		=> �����ְ� ���� ������ String�� �ƴϴ��� ����, �Ǽ��� ���� �����͵� �������� �̿� �����ϴ�.
		
		String rcv = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
//		=> ���� ���� �Է¹޴� ����� ����ϸ�, guiȭ�� �� �Էµ� ������ ���α׷� ������
//		�����ϴµ�, ������ String ���·� �����ǹǷ� String ������ �����ؾ� �Ѵ�.
		System.out.println(rcv);
		
		String rcv2 = JOptionPane.showInputDialog("������ �Է��ϼ���.");
		int num = Integer.parseInt(rcv2);
		JOptionPane.showMessageDialog(null, "�Է¹��� �� + 10 = "+ (num+10));
	}
}
