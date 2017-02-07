package package5;

import java.util.Vector;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//练习如何使用vector
		Vector vt = new Vector();
		vt.add("1");
		vt.add("2");
		vt.add("3");
		vt.insertElementAt("0", 0);
		vt.insertElementAt("4", vt.size());
		for (int i = 0; i<vt.size();i++)
			System.out.println("Element is: "+vt.elementAt(i));

	}

}
