package package3;

import java.util.ArrayList;
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
		HashSet mySet = new HashSet();
		System.out.println("������10���ַ�");
		Scanner sc = new Scanner(System.in);
		for (int i =0;i<10;i++){
			System.out.println("�������" + i + "���ַ�");
			mySet.add(sc.next());
		}
		for (Object item:mySet){
			System.out.println(item.toString());
		}
	}
}

