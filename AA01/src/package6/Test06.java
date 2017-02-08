package package6;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.out.println("Before=======================");
//		myread();
//		mywrite();
//		System.out.println("\nAfter=========================");
//		myread();
		myRedirect();

	}
	
	public static void myRedirect() throws IOException{
		PrintStream console = System.out;
	
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Workstation\\iOS\\Notes\\iOS_1.txt"));


		PrintStream out = new PrintStream(new FileOutputStream("C:\\Workstation\\iOS\\Notes\\test.out"));

		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null){
			System.out.println(s);
		}
		out.close();
		System.setOut(console);
		
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
