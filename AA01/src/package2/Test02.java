package package2;

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//�������ϰSystem���÷�
		
		long beginTime = System.currentTimeMillis();
		Thread.sleep(2000);
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ��-��ʼʱ��Ϊ" + (endTime - beginTime) + "����");
	}

}
