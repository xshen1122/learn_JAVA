package package6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before=======================");
		myread();
		mywrite();
		System.out.println("\nAfter=========================");
		myread();

	}
	public static void mywrite(){
		String Filename = "C:\\Workstation\\iOS\\Notes\\java_basic.txt";
		try {
			FileOutputStream ou = new FileOutputStream(new File(Filename));
			String str = "Good Taste.";
			byte[] b;
			b = str.getBytes(); //���ַ���ת��Ϊbyte[]����
			//byte[] b = {'h','e','l','l','o'};
			ou.write(b);//���ǴӺ���ӣ�����ֱ�ӳ��ԭ��������
			
			ou.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void myread(){
		//��ϰFile
		String Filename = "C:\\Workstation\\iOS\\Notes\\java_basic.txt";

		try {
			FileInputStream in = new FileInputStream(new File(Filename));
			while(in.available()>0){
				System.out.print((char)in.read());//in.read()һ���ַ�һ���ַ��Ķ�ȡ��
			}
			
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

		

}
