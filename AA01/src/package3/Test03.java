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
		//练习Collection的用法
//		ArrayList<Fraction> al = new ArrayList<Fraction>();
//		
//	
//		for (int i = 0; i< 10; i++){
//			al.add(new Fraction(i,i+1));
//			(al.get(i)).print();}
//	
//		//获取ArrayList的元素
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
		//练习题：用Set存储用户输入的10个字符；
//		HashSet mySet = new HashSet();
//		System.out.println("请输入10个字符");
//		Scanner sc = new Scanner(System.in);
//		for (int i =0;i<10;i++){
//			System.out.println("请输入第" + i + "个字符");
//			mySet.add(sc.next());
//		}
//		for (Object item:mySet){
//			System.out.println(item.toString());
//		}
//		
		
		//练习题，将int，String互相转换
//		int number = 18;
//		String number_1 ;
//		number_1 = Integer.toString(number);
//		int number_2;
//		number_2 = Integer.parseInt(number_1);
//		System.out.println("转换为String的是" + number_1);
//		System.out.println("转换为Int的是" + number_2);
		
		//练习题，取出每种类型的最大值,必须是对象才有MAX_VALUE，所以不能使用基本类型
//		Integer number_int = null;
//		System.out.println("int类型的最大值为" + number_int.MAX_VALUE);
//		Long number_long = null;
//		System.out.println("long类型的最大值为" + number_long.MAX_VALUE);
//		Short number_short = null;
//		System.out.println("short类型的最大值为" + number_short.MAX_VALUE);
//		Float number_float = null;
//		System.out.println("float类型的最大值为" + number_float.MAX_VALUE);
//		Byte number_byte = null;
//		System.out.println("byte类型的最大值为" + number_byte.MAX_VALUE);
//		Double number_double = null;
//		System.out.println("double类型的最大值为" + number_double.MAX_VALUE);
		
		//练习题，指定某年某月有多少天
		// 先判断是不是闰年，如果是闰年，2月29天，否则2月28天，其他的月份不变
//		boolean leap = false;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入年份:");
//		int year = Integer.parseInt(sc.next());
//		System.out.println("请输入月份:");
//		int month = Integer.parseInt(sc.next());
//		if (year%100 !=0)
//			if (year%4 == 0)
//				leap=true;
//		else
//			if (year%400 == 0)
//				leap = true;
//		if (month == 1 || month == 8 || month==3 || month==5|| month==7||month==10||month==12)
//			System.out.println(year + "年" + month + "月为" + "31天");
//		else if (month==4||month==6||month==9||month==11)
//			System.out.println(year + "年" + month + "月为" + "30天");
//		else if(month == 2 && leap == true)
//			System.out.println(year + "年" + month + "月为" + "29天");
//		else
//			System.out.println(year + "年" + month + "月为" + "28天");
//		
		
		//练习题，指数，对数，平方根，三角函数
		int number = Math.abs(-5);
		double n1 = Math.sqrt(11.23);
	}
}

