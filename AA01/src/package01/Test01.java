package package01;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1= "ABCD";
//		System.out.println(s1.endsWith("D"));
//		String s2= s1.replace('B', 'E');
//		print(s2);
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append("1234");
//		print(sb instanceof StringBuilder);
//		Integer i = new Integer(18);
//		int ivalue = i.intValue();
//		print(ivalue);
		
		//---File
//		File dirname = new File("C:\\@Workspace\\Automation\\csharp");
//		print(dirname.isFile());
//		print(dirname.isDirectory());
//		dirname.mkdirs();//mkdir只能创建父目录存在的情况。mkdirs能创建父目录和子目录；
//		dirname.exists();
//		File filename = new File("C:\\@Workspace\\Automation\\csharp\\hello.cs");
//		print(filename.exists());
//		print(filename.canRead());
//		print(filename.getAbsolutePath());
//		print(filename.canWrite());
//		print(filename.getPath());
//		print(filename.getName());
//		print(filename.length());
//		print(filename.lastModified());
//		
//		for(String item: dirname.list()){
//			print(item);
//		}
//		
//		
//		for(File item:File.listRoots()){
//			System.out.print(item.getAbsolutePath());
//		}
//		
		//用户输入5个数字，放到数组里，然后求平均值，最大和最小值；
//		int[] num_list = new int[5];
//		System.out.println("请输入5个整数");
//		Scanner sc = new Scanner(System.in);
//		int test;
//		for (int itime=0;itime<5;itime++){
//			System.out.print("第" + itime + "个数为:");
//			num_list[itime]=sc.nextInt();
//		}
//		
//
//		print(Arrays.toString(num_list));
//		
		//调用Fraction
		Fraction fc = new Fraction(1,3);
		Fraction fc1 = new Fraction(1,4);
		fc.print();
		fc1.print();
		(fc.add(fc1)).print();

		
	}
	static void print(String s){
		System.out.println(s);
	}
	static void print(boolean s){
		System.out.println(s);
	}
	static void print(int i){
		System.out.println(i);
	}
	static void print(long l){
		System.out.println(l);
	}
}
