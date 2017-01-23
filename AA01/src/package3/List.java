package package3;

public class List {
	private Node Head = null;
	private Node Tail = null;
	private Node Pointer = null;
	private int Length = 0;
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty(){
		return (this.Length==0);
	}
	//ɾ�����С�
	public void deleteAll(){
		Head = null;
		Tail = null;
		Pointer = null;
		Length = 0;
		
	}
	//��λ��ʹ��һ���ڵ�Ϊ��ǰ�ڵ�,ΪɶPointer=null�����Ǹ�λ��
	public void reset(){
		Pointer = null;
	}
	//�жϵ�ǰ����Ƿ�Ϊ���һ�����
	public boolean isEnd(){
		if(Length == 0){
			throw new java.lang.NullPointerException();}
		else if (Length==1)
				return true;
		else
			return (cursor() == Tail);
		
	}
	
	//���ص�ǰ������һ������ֵ����ʹ���Ϊ��ǰ���
	public Object nextNode(){
		if(Length == 1)
			throw new java.util.NoSuchElementException();
		else if (Length==0)
			throw new java.lang.NullPointerException();
		else{
			Node temp = cursor();//��ǰ���
			Pointer = temp;//����ǰ��㸳��Pointer
			if(temp!=Tail)
				return (temp.next.data);//������һ������ֵ��
			else
				throw new java.util.NoSuchElementException();
		}
			
	}
	
	//���ص�ǰ����ֵ
	public Object currentNode(){
		Node temp = cursor();//��ȡ��ǰ���
		return temp.data;//���ص�ǰ����ֵ
	}
	
	//�ڵ�ǰ���ǰ����һ����㣬��ʹ���Ϊ��ǰ���
	public void insert(Object d){
		Node e = new Node(d);
		if (Length == 0){
			Tail = e;
			Head = e;
		}
		else{
			Node temp = cursor();//��ȡ��ǰ���
			e.next = temp;//����Ľ���nextָ��ǰ���
			if (Pointer == null)
				Head = e;
			else
				Pointer.next = e;
		}
			Length ++; 
	}
	
	//��������Ĵ�С
	public int size(){
		return Length;
	}
	
	//����ǰ����Ƴ�����һ������Ϊ��ǰ��㡣����Ƴ��Ľ�������һ����㣬���һ������Ϊ��ǰ���
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
	
	
	//���ص�ǰ����ָ��
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
	//����Ϊ���캯��
	Node(Object d){
		data = d;
		next = null;
	}
}

/*�������
1.Pointer ǰһ������next
2.Node����Object + next





*/