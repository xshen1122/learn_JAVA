package package4;

public class Worker implements DoHomeWork {



//����ʵ��DoHomeWork�ӿ�
	@Override
	public void doHomeWork(String homework, String answer) {
		// TODO Auto-generated method stub
		System.out.println("��ҵ��");
		if(answer!=null){
		System.out.println("��ҵ��"+homework+"��"+answer);
		}else{
		System.out.println("��ҵ��"+homework+"��"+"(�հ�)");
		}
		
	}

}
