package package2;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//�������ϰSystem���÷�
		
		long beginTime = System.currentTimeMillis();
		Thread.sleep(2000);
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ��-��ʼʱ��Ϊ" + (endTime - beginTime) + "����");
		
		//��ϰ�⣺��"ABDCDEFG"��ȡ�������ٰ�"B","F"��ȡ����
		//����˼·����String��
		String str1 = "ABCDEFG";
		String tmp1 = str1.substring(2, 4);
		String tmp2 = str1.substring(1,2);
		String tmp3 = str1.substring(5,6);
		System.out.println("�𰸷ֱ�Ϊ��" + tmp1 + "," + tmp2 + "," + tmp3);
		
		//��A1B2C3D4E5F6������ĸ�����ֲַ��2�����֣��ֱ����int_list �� char_list�С�
		//˼·����for ѭ��
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
		System.out.println("��������Ϊ" + Arrays.toString(num_list) + "��ĸ����Ϊ��" + Arrays.toString(str_list) );
		
	}

}
