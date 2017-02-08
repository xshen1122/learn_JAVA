package package8;

import java.io.File;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Workstation");
		fileData(f);
		File newone = new File("C\\Workstation\\test");
//		if (checkDir(newone)==false)
			makeDir(newone);
		checkDir(newone);
		
	}
	
	public static void fileData(File f){
		System.out.println("绝对路径 " + f.getAbsolutePath());
		System.out.println("是不是可读" + f.canRead());
		System.out.println("是不是可写 " + f.canWrite());
		System.out.println("是不是可执行 " + f.canExecute());
		System.out.println("是不是文件 " + f.isFile());
		System.out.println("是不是文件夹 " + f.isDirectory());
		System.out.println("长度  " + f.length());
		System.out.println("上次修改时间 " + f.lastModified());
		
	}
	public static void makeDir(File dir){
		dir.mkdir();
	}
	
	
	public static boolean checkDir(File dir){
		File root = new File("C\\Workstation");
		
		if(dir.exists())
			{System.out.println("该文件夹存在");
			return true;}
		else
			{System.out.println("该文件夹不存在");
			return false;}
	}

}
