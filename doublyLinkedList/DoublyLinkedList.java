package doublyLinkedList;
public class DoublyLinkedList {
private LinkNode head;
private LinkNode tail;
private int totalElement;

public class LinkNode
{
	private int data;
	private LinkNode previous;
	private LinkNode next;

public LinkNode(int data)
{
	this.data=data;
}
}
public DoublyLinkedList() {
	this.head = null;
	this.tail = null;
	this.totalElement = 0;
}
public Boolean isEmpty()
{
	return totalElement==0;
}
public void count() {
	System.out.println("total elements are "+totalElement);
}
public void display()
{
	LinkNode current = head;
	while(current != null)
	{
		System.out.print(current.data+"-->");
		current=current.next;
	}
	System.out.println("Null");
}
public void reverseDisplay()
{
	LinkNode current = tail;
	while(current != null)
	{
		System.out.print(current.data+"-->");
		current=current.previous;
	}
	System.out.println("Null");
}
public void insertFront(int data)
{
	LinkNode newnode =new LinkNode(data);
	LinkNode current=head;
	newnode.next=head;
	head.previous=newnode;
	head=newnode;
	totalElement++;
}
public void insertLast(int data)
{
	LinkNode newnode =new LinkNode(data);
	LinkNode current=tail;
	if(isEmpty())
	{
		head=newnode;
	}
	else
	{
		tail.next=newnode;
	}
newnode.previous=tail;
tail=newnode;
	totalElement++;
}
public void deleteLast()
{
	LinkNode current= tail;
	current=current.previous;
	current.next=null;
	tail.previous=null;
	tail=current;
	totalElement--;
}
public void deletefirst()
{
	LinkNode current= head;
	if(current.next==null)
	{
		head=null;
	}
	else
	{
		head=head.next;
		current.next=null;
		head.previous=null;
	}
	totalElement--;
}
public static void main(String[] args) {
	DoublyLinkedList dll=new DoublyLinkedList();
	
	dll.insertLast(10);
	dll.insertLast(20);
	dll.insertLast(30);
	dll.insertLast(40);
	dll.insertLast(50);
	dll.display();
	dll.reverseDisplay();
	dll.count();
	dll.insertFront(60);
	dll.display();
	dll.reverseDisplay();
	dll.count();
	dll.deleteLast();
	dll.display();
	dll.reverseDisplay();
	dll.count();
	dll.deletefirst();
	dll.display();
	dll.reverseDisplay();
	dll.count();
}
}
