package package01;

public class Fraction {
	int num; //����
	int dec; //��ĸ
	public Fraction(int n, int d){
		num = n;
		dec = d;
	}
	public void print(){
		System.out.println("����Ϊ" + num +"/" + dec);
	}
	
	//����������� 
	public Fraction add(Fraction fc1){
		Fraction tmp = new Fraction(1,1);
		tmp.num = this.num*fc1.dec + this.dec*fc1.num;
		tmp.dec = this.dec * fc1.dec;
		return tmp;
		
	}

}
