package package4;

import java.util.concurrent.TimeUnit;

public class Roommate {
	public String getAnswer(String homework){
		if ("1+1=?".equals(homework))
			return "2";
		else
			return null;
	}
	//�����ǻص������Ĺؼ�������B������������A�ķ�����ֻ�޶���ѧ����,������ע�͵�
//	public void getAnswer(String homework,Student st){
//		if ("1+1=?".equals(homework))
//			st.doHomework(homework, "2");
//		else
//			st.doHomework(homework, null);
//	}
	//�����˽ӿڡ����Զ��κ��ֻ࣬Ҫ����ʵ����DoHomeWork�ӿ�
	public void getAnswer(String homework,DoHomeWork someone){
		if ("1+1=?".equals(homework))
			someone.doHomeWork(homework, "2");
		if("x->0��sin(x)/x=?".equals(homework)){
			System.out.println("....˼��");
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
