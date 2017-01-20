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
	
	//两个分数相加 
	public Fraction add(Fraction fc1){
		Fraction tmp = new Fraction(1,1);
		tmp.num = this.num*fc1.dec + this.dec*fc1.num;
		tmp.dec = this.dec * fc1.dec;
		return tmp;
		
	}

}
