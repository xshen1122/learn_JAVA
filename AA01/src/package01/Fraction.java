package package01;

public class Fraction {
	int num; //分子
	int dec; //分母
	public Fraction(int n, int d){
		num = n;
		dec = d;
	}
	public void print(){
		System.out.println("分数为" + num +"/" + dec);
	}
	

}
