package package5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class test01 extends Thread  {
	public void run(){
		for (int i = 0;i <5;i++)
			compute();
	}
//Ϊɶû��5��Thread��

	static void compute(){
		ThreadLocal numcalls = new ThreadLocal();
		
		Integer n = (Integer)numcalls.get();
		if (n==null)
			n=new Integer(1);
		else
			n = new Integer(n.intValue() + 1);
		numcalls.set(n);
		
		System.out.println(Thread.currentThread().getName() + ":" + n);
		
		for (int i = 0,j=0;i<100;i++){
			j += i;
			try {
				Thread.sleep((int)(Math.random()*100+1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Thread.yield();
	}
	
	

	public static void main(String[] args) {
		//����ThreadDemo
		test01 thread1 = new test01(); //����1
		Thread thread2 = new Thread(new Runnable(){ 
			public void run(){
				for (int i = 0;i<5;i++)
					compute();
			}
		}
		);
		//���������̵߳�����
		if(args.length>1)
			thread1.setPriority(Integer.parseInt(args[0]));
		if(args.length>2)
			thread2.setPriority(Integer.parseInt(args[1]));
		
		//�����߳�
		thread1.start();
		thread2.start();
		
		for (int i=0;i<5;i++)
			compute();
		
		
	
		
		
		//����SimpleThread
		/*
		for (int i = 0;i<3;i++){
			new SimpleThread().start();//����3���߳�
		}
		System.out.println("All Threads have been started.");
		*/
		
		
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
		/*
		test01 ts = new test01();
		Properties pt = new Properties();
		
		//��������
		pt.setProperty("C", "China");
		pt.setProperty("A", "American");
		pt.setProperty("B", "Brazil");
		pt.setProperty("D", "Dutch");
		
		//ö�����ԣ����д��Enumeration��ʾ�������Ҫд��Enumeration<?>
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
		
		*/
		
		//��ϰʹ��ArrayList��������Vector
		/*
		ArrayList a = new ArrayList();
		
		//�������Ԫ��
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		//a.add(new Integer(2));
		
		System.out.println(a);
		//ArrayList �� Iterator����,�����ã�
		java.util.Iterator it = a.iterator();
	
		it.next();
		it.remove();
		System.out.println(a);
		it.next();
		it.remove();
		System.out.println(a);
		
		*/
		
		//��ϰ�߳�
		
		
		
		

	}


}
