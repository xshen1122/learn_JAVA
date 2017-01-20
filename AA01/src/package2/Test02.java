package package2;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//这个来练习System的用法
		
		long beginTime = System.currentTimeMillis();
		Thread.sleep(2000);
		long endTime = System.currentTimeMillis();
		System.out.println("结束时间-开始时间为" + (endTime - beginTime) + "毫秒");
		
		//练习题：将"ABDCDEFG"截取出来，再把"B","F"截取出来
		//答题思路：用String类
		String str1 = "ABCDEFG";
		String tmp1 = str1.substring(2, 4);
		String tmp2 = str1.substring(1,2);
		String tmp3 = str1.substring(5,6);
		System.out.println("答案分别为：" + tmp1 + "," + tmp2 + "," + tmp3);
		
		//将A1B2C3D4E5F6按照字母和数字分拆成2个数字，分别放在int_list 和 char_list中。
		//思路：用for 循环
		String str2 = "A1B2C3D4E5F6";
		int num_len = str2.length();
		int[] num_list = new int[num_len/2];
		char[] str_list = new char[num_len/2];
		int j = 0;
		int k = 0;
		for (int i = 0;i<num_len;i++){
			if (i%2 == 0){
				str_list[j] = str2.charAt(i);
				j++;
			}
			else{
				num_list[k] = (int)(str2.charAt(i))-48;
				k++;
				}
		}
		System.out.println("数字序列为" + Arrays.toString(num_list) + "字母序列为：" + Arrays.toString(str_list) );
		
	}

}
