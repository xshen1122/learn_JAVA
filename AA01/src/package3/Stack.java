package package3;

import java.util.LinkedList;

public class Stack {
	LinkedList ll = new LinkedList();
	public boolean isEmpty(){
		//return (ll.size() == 0);
		return ll.isEmpty();
	}
	//获取顶部元素。
	public Object top(){
		return ll.getFirst();
	}
	//推到Stack里面
	public void push(Object element){
		ll.addFirst(element);
		
	}
	//弹出。
	public void pop(){
		ll.removeFirst();
	}
}
