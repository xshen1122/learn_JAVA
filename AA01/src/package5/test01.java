package package5;

import java.util.Arrays;
import java.util.Vector;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//练习如何使用vector
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
		}

	}

}
