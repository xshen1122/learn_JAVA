package package4;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		Roommate rt = new Roommate();
		Worker wk = new Worker();
		Doctor dt = new Doctor();
//		String homework = "1+1=?";
//		rt.getAnswer(homework, st);
//		rt.getAnswer(homework, wk);
//		rt.getAnswer(homework, dt);
		//������������
//		rt.getAnswer(homework, new DoHomeWork(){
//			public void doHomeWork(String homework,String answer){
//				System.out.println("��ҵ��");
//				System.out.println("����"+homework+"��"+answer);
//				}
//		});
	//�첽�ص�
		String homework="x->0��sin(x)/x=?";
		st.ask(homework, rt);
		rt.getAnswer(homework, st);
		
	}

}

