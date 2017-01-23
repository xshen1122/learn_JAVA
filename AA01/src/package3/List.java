package package3;

public class List {
	private Node Head = null;
	private Node Tail = null;
	private Node Pointer = null;
	private int Length = 0;
	//判断是否为空
	public boolean isEmpty(){
		return (this.Length==0);
	}
	//删除所有。
	public void deleteAll(){
		Head = null;
		Tail = null;
		Pointer = null;
		Length = 0;
		
	}
	//复位，使第一个节点为当前节点,为啥Pointer=null，就是复位？
	public void reset(){
		Pointer = null;
	}
	//判断当前结点是否为最后一个结点
	public boolean isEnd(){
		if(Length == 0){
			throw new java.lang.NullPointerException();}
		else if (Length==1)
				return true;
		else
			return (cursor() == Tail);
		
	}
	
	//返回当前结点的下一个结点的值，并使其成为当前结点
	public Object nextNode(){
		if(Length == 1)
			throw new java.util.NoSuchElementException();
		else if (Length==0)
			throw new java.lang.NullPointerException();
		else{
			Node temp = cursor();//当前结点
			Pointer = temp;//将当前结点赋给Pointer
			if(temp!=Tail)
				return (temp.next.data);//返回下一个结点的值；
			else
				throw new java.util.NoSuchElementException();
		}
			
	}
	
	//返回当前结点的值
	public Object currentNode(){
		Node temp = cursor();//获取当前结点
		return temp.data;//返回当前结点的值
	}
	
	//在当前结点前插入一个结点，并使其成为当前结点
	public void insert(Object d){
		Node e = new Node(d);
		if (Length == 0){
			Tail = e;
			Head = e;
		}
		else{
			Node temp = cursor();//获取当前结点
			e.next = temp;//插入的结点的next指向当前结点
			if (Pointer == null)
				Head = e;
			else
				Pointer.next = e;
		}
			Length ++; 
	}
	
	//返回链表的大小
	public int size(){
		return Length;
	}
	
	//将当前结点移除，下一个结点成为当前结点。如果移除的结点是最后一个结点，则第一个结点成为当前结点
	public Object remove(){
		Object temp;
		if (Length==0)
			throw new java.util.NoSuchElementException();
		else if (Length == 1){
			temp = Head.data;
			deleteAll();}
		else{
			Node cur = cursor();
			temp = cur.data;
			if (cur == Head)
				Head = cur.next;
			else if (cur == Tail)
			{
				Pointer.next = null;
				Tail = Pointer;
				reset();
			}
			else
				Pointer.next = cur.next;
			Length--;
		}
		return temp;
	}
	
	
	//返回当前结点的指针
	private Node cursor(){
		if(Head == null)
			throw new java.lang.NullPointerException();
		else if(Pointer == null)
			return Head;
		else
			return Pointer.next;
	}
}

class Node{
	Object data;
	Node next;
	//以下为构造函数
	Node(Object d){
		data = d;
		next = null;
	}
}

/*程序解释
1.Pointer 前一个结点的next
2.Node包含Object + next





*/