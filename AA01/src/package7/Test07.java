package package7;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("C:\\Workstation\\workspace");
		String[] list;
		if (args.length == 0)
			list = path.list();
		else{
			list = path.list(new DirFilter(args[0]));
		}
		for (int i = 0;i<list.length;i++)
			System.out.println(list[i]);
		

	}}
	//һ��class���治�ܰ�������һ��class������class Test07���ܰ���DirFilter,��д�ӿ�
	class DirFilter implements FilenameFilter{
		private Pattern pattern;
		public DirFilter(String regex){
			pattern = Pattern.compile(regex);
		}

		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return pattern.matcher(new File(name).getName()).matches();
		}
		
	}


