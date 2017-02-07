package package5;

public class SimpleThread extends Thread{
	private int countDown = 5;
	private static int threadCount = 0;
	private int threadNumber = ++ threadCount;
	
	public SimpleThread(){
		System.out.println("Making" + threadCount);
	}
	public void run(){
		while (true){
			System.out.println("Thread" + threadCount + "(" + countDown + ")");
			if (--countDown == 0) return;
		}
	}
	

}
