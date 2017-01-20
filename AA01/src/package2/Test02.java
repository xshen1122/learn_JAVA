package package2;

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//这个来练习System的用法
		
		long beginTime = System.currentTimeMillis();
		Thread.sleep(2000);
		long endTime = System.currentTimeMillis();
		System.out.println("结束时间-开始时间为" + (endTime - beginTime) + "毫秒");
	}

}
