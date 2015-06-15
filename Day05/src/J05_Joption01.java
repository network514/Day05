import javax.swing.JOptionPane;

public class J05_Joption01 {

	public static void main(String[] args) {
		String msg = "보여주고 싶은 문장";
		System.out.println(msg);
		
		JOptionPane.showMessageDialog(null, msg);
//		=> 보여주고 싶은 메시지를 gui형식을 통해 제공함
//		=> 소괄호 안쪽은 기본적으로, null과 출력하고 싶은 메시지를 입력한다.
		JOptionPane.showMessageDialog(null, "으흠으흠");
		JOptionPane.showMessageDialog(null, 1872638912);
		JOptionPane.showMessageDialog(null, 123431.14144564534343444);
//		=> 보여주고 싶은 내용이 String이 아니더라도 정수, 실수의 형태 데이터도 문제없이 이용 가능하다.
		
		String rcv = JOptionPane.showInputDialog("이름을 입력하세요.");
//		=> 위와 같이 입력받는 기능을 사용하면, gui화면 상에 입력된 내용이 프로그램 영역에
//		도착하는데, 무조건 String 형태로 제공되므로 String 변수에 저장해야 한다.
		System.out.println(rcv);
		
		String rcv2 = JOptionPane.showInputDialog("정수를 입력하세요.");
		int num = Integer.parseInt(rcv2);
		JOptionPane.showMessageDialog(null, "입력받은 수 + 10 = "+ (num+10));
	}
}