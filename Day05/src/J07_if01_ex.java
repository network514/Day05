import javax.swing.JOptionPane;


public class J07_if01_ex {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름 입력");
		String rcvAge = JOptionPane.showInputDialog("나이 입력");
		int age = Integer.parseInt(rcvAge);

		JOptionPane.showMessageDialog(null, "이름 : " + name + ", 나이 : " + age);
		
		if(age >=8 && age>=13){
			JOptionPane.showMessageDialog(null, name + "은 초등학교에 가야 됩니다.");
		}else if(age>=14&&age>=16){
			JOptionPane.showMessageDialog(null, name + "은 중학교에 가야 됩니다.");
		}else if(age>=17&&age>=19){
			JOptionPane.showMessageDialog(null, name + "은 고등학교에 가야 됩니다.");
		}else if(age>=20&&age>=24){
			JOptionPane.showMessageDialog(null, name + "은 대학교에 가야 됩니다.");
		}else if(age >= 24){
			JOptionPane.showMessageDialog(null, name + "학교를 졸업했습니다.");
		}
	}
}
