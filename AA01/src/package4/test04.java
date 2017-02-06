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
		//以下是匿名类
//		rt.getAnswer(homework, new DoHomeWork(){
//			public void doHomeWork(String homework,String answer){
//				System.out.println("作业本");
//				System.out.println("问题"+homework+"答案"+answer);
//				}
//		});
	//异步回调
		String homework="x->0，sin(x)/x=?";
		st.ask(homework, rt);
		rt.getAnswer(homework, st);
		
	}

}

