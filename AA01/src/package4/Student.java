package package4;

public class Student implements DoHomeWork{
	public void doHomework(String homework){
		System.out.println("��ҵ��");
		if("1+1=?".equals(homework)){
			System.out.println("��ҵ" + homework + "��" + "2");
		}
		else
		{
			System.out.println("��ҵ" + homework + "��" + "��֪��~~");
		}
	}
	public void doHomework(String homework,String answer){
		System.out.println("��ҵ��");
		if (answer != null)
		
			System.out.println("��ҵ" + homework + "��" + answer);
		else
			System.out.println("��ҵ" + homework + "��" + "�հ�");
		
	}
	@Override
	public void doHomeWork(String homework, String answer) {
		// TODO Auto-generated method stub
		System.out.println("��ҵ��");
		if (answer != null)
		
			System.out.println("��ҵ" + homework + "��" + answer);
		else
			System.out.println("��ҵ" + homework + "��" + "�հ�");
		
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
	System.out.println("�һؼ��ˡ������������ѣ�����д����ҵ");
	}

}
