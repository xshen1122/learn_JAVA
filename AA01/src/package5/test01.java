package package5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//练习如何使用vector
		/*
		Vector vt = new Vector();
		vt.add("1");
		vt.add("7");
		vt.add("9");
		vt.insertElementAt("0", 0);
		vt.insertElementAt("4", vt.size());
		
		//输出全部的元素
		for (int i = 0; i<vt.size();i++)
			System.out.println("Element is: "+vt.elementAt(i));
		//输出第一个元素和最后一个元素
		System.out.println("The first element is " + vt.firstElement());
		System.out.println("The last element is " + vt.lastElement());
		
		//将Vector中的元素排序后输出
		Object[] content = new Object[vt.size()];
		vt.copyInto(content);
		int[] contentNumber = new int[vt.size()];
		for (int j= 0;j<vt.size();j++)
			contentNumber[j]=Integer.parseInt(content[j].toString());
		Arrays.sort(contentNumber);
		for(int number:contentNumber){
			System.out.println("Element is" + number);
		}*/
		
		
		//练习使用properties
		/*
		test01 ts = new test01();
		Properties pt = new Properties();
		
		//设置属性
		pt.setProperty("C", "China");
		pt.setProperty("A", "American");
		pt.setProperty("B", "Brazil");
		pt.setProperty("D", "Dutch");
		
		//枚举属性，如果写成Enumeration提示编译错误，要写成Enumeration<?>
		Enumeration<?> e = pt.propertyNames();
		
		
		
		
		//输出所有的key
		while(e.hasMoreElements()){
			System.out.println(e.nextElement().toString());
		}
		//输出key是没有顺序的。
		//输出所有的properties
		System.out.println(pt.getProperty("C"));
		System.out.println(pt.getProperty("A"));
		System.out.println(pt.getProperty("B"));
		System.out.println(pt.getProperty("D"));
		
		*/
		
		//练习使用ArrayList，类似于Vector
		ArrayList a = new ArrayList();
		
		//往里面加元素
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		//a.add(new Integer(2));
		
		System.out.println(a);
		//ArrayList 的 Iterator属性,不能用？
		java.util.Iterator it = a.iterator();
	
		it.next();
		it.remove();
		System.out.println(a);
		it.next();
		it.remove();
		System.out.println(a);
		
		
		
		

	}

}
