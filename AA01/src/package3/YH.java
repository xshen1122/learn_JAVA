package package3;

import java.util.Arrays;

public class YH {
	int dem;
	public YH(int d){
		dem = d;
	}
	//��ϰ�⣬��JAVAʵ�����������
			//�Ҿ��ÿ�����ArrayList��ʵ��
			//���ʹ��int[]�̶���С��������ʵ�֣�
	public void show(){
			int[] line =new int [dem];
			int[] pre= new int[dem];
			pre[0]=1;
			//i ����
			for (int i = 1;i<dem;i++){
				
				for (int j =1;j<dem;j++)
				{	line[0]=1;
					line[j]=pre[j-1] + pre[j];
					
				
				}
				pre=Arrays.copyOf(line, line.length);//���ﲻ��ֱ�ӽ�line����pre�����ǽ�line��ֵ����pre
				print(line);}
	}

	public void print(int[] list){
		for (int item:list){
			if(item != 0)
				System.out.print(item + "   ");
			else
				System.out.print("");
		
		}
		System.out.print("\n");
	}
}
