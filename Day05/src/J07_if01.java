import javax.swing.JOptionPane;


public class J07_if01 {
	public static void main(String[] args) {
//		학생 학교 보내기 프로그램
		String name = JOptionPane.showInputDialog("이름 입력");
		String rcvAge = JOptionPane.showInputDialog("나이 입력");
		int age = Integer.parseInt(rcvAge);

		JOptionPane.showMessageDialog(null, "이름 : " + name + ", 나이 : " + age);
		
		System.out.println("#. 1");
		if(age >=8 && age>=13){
			System.out.println(name + "은 초등학교에 가야 됩니다.");
		}else if(age>=14&&age>=16){
			System.out.println(name + "은 중학교에 가야 됩니다.");
		}else if(age>=17&&age>=19){
			System.out.println(name + "은 고등학교에 가야 됩니다.");
		}else if(age>=20&&age>=24){
			System.out.println(name + "은 대학교에 가야 됩니다.");
		}else if(age >= 24){
			System.out.println(name + "학교를 졸업했습니다.");
		}
	}
}