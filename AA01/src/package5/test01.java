package package5;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ϰ���ʹ��vector
		/*
		Vector vt = new Vector();
		vt.add("1");
		vt.add("7");
		vt.add("9");
		vt.insertElementAt("0", 0);
		vt.insertElementAt("4", vt.size());
		
		//���ȫ����Ԫ��
		for (int i = 0; i<vt.size();i++)
			System.out.println("Element is: "+vt.elementAt(i));
		//�����һ��Ԫ�غ����һ��Ԫ��
		System.out.println("The first element is " + vt.firstElement());
		System.out.println("The last element is " + vt.lastElement());
		
		//��Vector�е�Ԫ����������
		Object[] content = new Object[vt.size()];
		vt.copyInto(content);
		int[] contentNumber = new int[vt.size()];
		for (int j= 0;j<vt.size();j++)
			contentNumber[j]=Integer.parseInt(content[j].toString());
		Arrays.sort(contentNumber);
		for(int number:contentNumber){
			System.out.println("Element is" + number);
		}*/
		
		
		//��ϰʹ��properties
		test01 ts = new test01();
		Properties pt = new Properties();
		
		//��������
		pt.setProperty("C", "China");
		pt.setProperty("A", "American");
		pt.setProperty("B", "Brazil");
		pt.setProperty("D", "Dutch");
		
		//ö������
		Enumeration<?> e = pt.propertyNames();
		//������е�key
		while(e.hasMoreElements()){
			System.out.println(e.nextElement().toString());
		}
		//���key��û��˳��ġ�
		//������е�properties
		System.out.println(pt.getProperty("C"));
		System.out.println(pt.getProperty("A"));
		System.out.println(pt.getProperty("B"));
		System.out.println(pt.getProperty("D"));

	}

}
