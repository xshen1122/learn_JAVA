package package4;

public class Worker implements DoHomeWork {



//工人实现DoHomeWork接口
	@Override
	public void doHomeWork(String homework, String answer) {
		// TODO Auto-generated method stub
		System.out.println("作业本");
		if(answer!=null){
		System.out.println("作业："+homework+"答案"+answer);
		}else{
		System.out.println("作业："+homework+"答案"+"(空白)");
		}
		
	}

}
