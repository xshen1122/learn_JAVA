package package3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import package01.Fraction;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ϰCollection���÷�
//		ArrayList<Fraction> al = new ArrayList<Fraction>();
//		
//	
//		for (int i = 0; i< 10; i++){
//			al.add(new Fraction(i,i+1));
//			(al.get(i)).print();}
//	
//		//��ȡArrayList��Ԫ��
//		al.remove(9);
//		al.remove(8);
//		al.remove(7);
//		
//		
//		for (Fraction item:al)
//			item.print();
//		
//		Iterator it= al.iterator();
//		it.hasNext();
		//��ϰ�⣺��Set�洢�û������10���ַ���
//		HashSet mySet = new HashSet();
//		System.out.println("������10���ַ�");
//		Scanner sc = new Scanner(System.in);
//		for (int i =0;i<10;i++){
//			System.out.println("�������" + i + "���ַ�");
//			mySet.add(sc.next());
//		}
//		for (Object item:mySet){
//			System.out.println(item.toString());
//		}
		
		//��ϰ�⣬��Math������sqrt��abs��
		int abs_value = Math.abs(-5);
		double sqrt_value = Math.sqrt(11.73);
		
		
		//��ϰ�⣬ʹ��getClass����
		Test03 t3 = new Test03();
		System.out.println("Class is " + t3.getClass().getName());
		
		//��ϰ�⣬��JAVAʵ�����������
		//�Ҿ��ÿ�����ArrayList��ʵ��
		int[] line =new int [5];
		int[] pre= {1,0,0,0,0};
		
		for (int i = 0;i<5;i++)
		{	line[i]=pre[i] + pre[i+1];
			pre = line;
			System.out.println(Arrays.toString(line));
		}
	}
}

