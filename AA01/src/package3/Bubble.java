package package3;

import java.util.Arrays;

public class Bubble {
	int[] test;
	//��ȡ�û���������int list
	public Bubble(int[] list){
		test = Arrays.copyOf(list, list.length);
	}
	//ʹ��ð���㷨��������
	public void sort(){
		int tmp=0;
		for (int i = 0;i<test.length;i++){
			for (int j = i+1;j<test.length-1;j++){
				if (test[j]>test[j+1])
					{tmp = test[j+1];
					test[j+1]=test[j];
					test[j]=tmp;}
			}
		}
	}

}
