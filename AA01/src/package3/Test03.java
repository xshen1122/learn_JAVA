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
		HashSet mySet = new HashSet();
		System.out.println("请输入10个字符");
		Scanner sc = new Scanner(System.in);
		for (int i =0;i<10;i++){
			System.out.println("请输入第" + i + "个字符");
			mySet.add(sc.next());
		}
		for (Object item:mySet){
			System.out.println(item.toString());
		}
	}
}

