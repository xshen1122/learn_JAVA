package package3;

import java.util.LinkedList;

public class Stack {
	LinkedList ll = new LinkedList();
	public boolean isEmpty(){
		//return (ll.size() == 0);
		return ll.isEmpty();
	}
	//��ȡ����Ԫ�ء�
	public Object top(){
		return ll.getFirst();
	}
	//�Ƶ�Stack����
	public void push(Object element){
		ll.addFirst(element);
		
	}
	//������
	public void pop(){
		ll.removeFirst();
	}
}
