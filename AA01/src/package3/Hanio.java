package package3;

public class Hanio {
//汉诺塔问题
	int ta;
	//把塔的层数传进来
	//汉诺塔思路：F(1)=1;F(n)=2*F(n-1)+1;
	public int process(int t){
		if(t==1){
			return 1;
		}
		else{
			return 2*process(t-1)+1;
		}
	}
	
}
