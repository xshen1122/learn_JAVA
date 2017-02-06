package package4;

public class Student implements DoHomeWork{
	public void doHomework(String homework){
		System.out.println("作业本");
		if("1+1=?".equals(homework)){
			System.out.println("作业" + homework + "答案" + "2");
		}
		else
		{
			System.out.println("作业" + homework + "答案" + "不知道~~");
		}
	}
	public void doHomework(String homework,String answer){
		System.out.println("作业本");
		if (answer != null)
		
			System.out.println("作业" + homework + "答案" + answer);
		else
			System.out.println("作业" + homework + "答案" + "空白");
		
	}
	@Override
	public void doHomeWork(String homework, String answer) {
		// TODO Auto-generated method stub
		System.out.println("作业本");
		if (answer != null)
		
			System.out.println("作业" + homework + "答案" + answer);
		else
			System.out.println("作业" + homework + "答案" + "空白");
		
	}
	public void ask(final String homework,final Roommate roommate){
		new Thread(new Runnable(){

		public void run(){
		roommate.getAnswer(homework,Student.this);
		}
		}).start();
		goHome();
		}
	public void goHome()
	{
	System.out.println("我回家了。。。。好室友，帮我写下作业");
	}

}
