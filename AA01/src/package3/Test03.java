package package3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.lang.Math;

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
//		
		
		//��ϰ�⣬��int��String����ת��
//		int number = 18;
//		String number_1 ;
//		number_1 = Integer.toString(number);
//		int number_2;
//		number_2 = Integer.parseInt(number_1);
//		System.out.println("ת��ΪString����" + number_1);
//		System.out.println("ת��ΪInt����" + number_2);
		
		//��ϰ�⣬ȡ��ÿ�����͵����ֵ,�����Ƕ������MAX_VALUE�����Բ���ʹ�û�������
//		Integer number_int = null;
//		System.out.println("int���͵����ֵΪ" + number_int.MAX_VALUE);
//		Long number_long = null;
//		System.out.println("long���͵����ֵΪ" + number_long.MAX_VALUE);
//		Short number_short = null;
//		System.out.println("short���͵����ֵΪ" + number_short.MAX_VALUE);
//		Float number_float = null;
//		System.out.println("float���͵����ֵΪ" + number_float.MAX_VALUE);
//		Byte number_byte = null;
//		System.out.println("byte���͵����ֵΪ" + number_byte.MAX_VALUE);
//		Double number_double = null;
//		System.out.println("double���͵����ֵΪ" + number_double.MAX_VALUE);
		
		//��ϰ�⣬ָ��ĳ��ĳ���ж�����
		// ���ж��ǲ������꣬��������꣬2��29�죬����2��28�죬�������·ݲ���
//		boolean leap = false;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���������:");
//		int year = Integer.parseInt(sc.next());
//		System.out.println("�������·�:");
//		int month = Integer.parseInt(sc.next());
//		if (year%100 !=0)
//			if (year%4 == 0)
//				leap=true;
//		else
//			if (year%400 == 0)
//				leap = true;
//		if (month == 1 || month == 8 || month==3 || month==5|| month==7||month==10||month==12)
//			System.out.println(year + "��" + month + "��Ϊ" + "31��");
//		else if (month==4||month==6||month==9||month==11)
//			System.out.println(year + "��" + month + "��Ϊ" + "30��");
//		else if(month == 2 && leap == true)
//			System.out.println(year + "��" + month + "��Ϊ" + "29��");
//		else
//			System.out.println(year + "��" + month + "��Ϊ" + "28��");
//		
		
		//��ϰ�⣬ָ����������ƽ���������Ǻ���
		int number = Math.abs(-5);
		double n1 = Math.sqrt(11.23);
	}
}

