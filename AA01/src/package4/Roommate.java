package package4;

import java.util.concurrent.TimeUnit;

public class Roommate {
	public String getAnswer(String homework){
		if ("1+1=?".equals(homework))
			return "2";
		else
			return null;
	}
	//这里是回调方法的关键。让类B方法中引用类A的方法，只限定了学生类,这里先注释掉
//	public void getAnswer(String homework,Student st){
//		if ("1+1=?".equals(homework))
//			st.doHomework(homework, "2");
//		else
//			st.doHomework(homework, null);
//	}
	//加入了接口。可以对任何类，只要该类实现了DoHomeWork接口
	public void getAnswer(String homework,DoHomeWork someone){
		if ("1+1=?".equals(homework))
			someone.doHomeWork(homework, "2");
		if("x->0，sin(x)/x=?".equals(homework)){
			System.out.println("....思考");
			for (int i = 1;i<=3;i++){
				System.out.println(i + "seconds");
				try{
					TimeUnit.SECONDS.sleep(1);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
				
			}
			System.out.println();
			someone.doHomeWork(homework, "1");
			
				
		}
		else
			someone.doHomeWork(homework, null);
	}

}
