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
		System.out.println("����·�� " + f.getAbsolutePath());
		System.out.println("�ǲ��ǿɶ�" + f.canRead());
		System.out.println("�ǲ��ǿ�д " + f.canWrite());
		System.out.println("�ǲ��ǿ�ִ�� " + f.canExecute());
		System.out.println("�ǲ����ļ� " + f.isFile());
		System.out.println("�ǲ����ļ��� " + f.isDirectory());
		System.out.println("����  " + f.length());
		System.out.println("�ϴ��޸�ʱ�� " + f.lastModified());
		
	}
	public static void makeDir(File dir){
		dir.mkdir();
	}
	
	
	public static boolean checkDir(File dir){
		File root = new File("C\\Workstation");
		
		if(dir.exists())
			{System.out.println("���ļ��д���");
			return true;}
		else
			{System.out.println("���ļ��в�����");
			return false;}
	}

}
