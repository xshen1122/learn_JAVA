package package4;

public class Doctor implements DoHomeWork {

	@Override
	public void doHomeWork(String homework, String answer) {
		System.out.println("��ҵ��");
		if (answer != null)
		
			System.out.println("��ҵ" + homework + "��" + answer);
		else
			System.out.println("��ҵ" + homework + "��" + "�հ�");
		
	}

}
