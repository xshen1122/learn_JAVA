package package4;

public class Doctor implements DoHomeWork {

	@Override
	public void doHomeWork(String homework, String answer) {
		System.out.println("作业本");
		if (answer != null)
		
			System.out.println("作业" + homework + "答案" + answer);
		else
			System.out.println("作业" + homework + "答案" + "空白");
		
	}

}
