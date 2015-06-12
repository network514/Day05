import javax.swing.JOptionPane;


public class J06_Joption02 {
	public static void main(String[] args) {
//		Joption을 이용해서 다음의 내용을 입력-출력하세요.
//		이름, 나이, 키 등등...
//		1. 입력 : 이름, 나이, 키 등등...
//		2. 입력 받은 내용 모두 출
//		3. 나의 15년 후 나이가 몇살인지 출력
		String rsv1 = JOptionPane.showInputDialog("이름을 입력하세요.");
		String rsv2 = JOptionPane.showInputDialog("나이를 입력하세요.");
		String rsv3 = JOptionPane.showInputDialog("성별 입력하세요.");
		String rsv4 = JOptionPane.showInputDialog("발사이즈를 입력하세요.");
		int num1 = Integer.parseInt(rsv2);
		int num2 = Integer.parseInt(rsv4);
		String showMsg = "나의 이름 : " + rsv1 + "\n";
		JOptionPane.showMessageDialog(null, showMsg);
		JOptionPane.showMessageDialog(null, "나이는 " + rsv2);
		JOptionPane.showMessageDialog(null, "10년 뒤 나이는 " + (num1+10) + "세");
		JOptionPane.showMessageDialog(null, "성별은 " + rsv3);
		JOptionPane.showMessageDialog(null, "발사이즈는 " + num2 + "cm");
	}
}
