package package3;

import java.util.Arrays;

public class YH {
	int dem;
	public YH(int d){
		dem = d;
	}
	//练习题，用JAVA实现杨辉三角形
			//我觉得可以用ArrayList来实现
			//如何使用int[]固定大小的数组来实现？
	public void show(){
			int[] line =new int [dem];
			int[] pre= new int[dem];
			pre[0]=1;
			//i 代表
			for (int i = 1;i<dem;i++){
				
				for (int j =1;j<dem;j++)
				{	line[0]=1;
					line[j]=pre[j-1] + pre[j];
					
				
				}
				pre=Arrays.copyOf(line, line.length);//这里不能直接将line赋给pre，而是将line的值赋给pre
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
