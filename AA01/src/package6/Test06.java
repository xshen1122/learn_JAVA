package package6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		}	

		

	}

}
