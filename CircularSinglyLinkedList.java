
public class CircularSinglyLinkedList {
	private static ListNode head;
	private int totalElement;
	
	public class ListNode
	{
		private int data;
		private ListNode next;
	
	public ListNode(int data)
	{
		this.data=data;
	}
	}
	public CircularSinglyLinkedList()
	{
	this.totalElement=0;
	head=null;
	}
public void totalElement()
{
	System.out.println("total elements are "+totalElement);
}
public boolean isEmpty()
{
	return totalElement==0;
}
public void insertLast(int data)
{
	ListNode newnode = new ListNode(data);
	if(totalElement ==0)
	{
		head=newnode;
		newnode.next=head;
	//	totalElement++;
	}
	ListNode current=head;
	while(current.next!=head)
	{
		current=current.next;
	}
	current.next=newnode;
	newnode.next=head;
	totalElement++;
}
public void insertFirst(int data)
{
	ListNode newnode = new ListNode(data);
	while(totalElement ==0)
	{
		head=newnode;
	newnode.next=head;
		totalElement++;
		
	}
	ListNode current=head;
	while(current.next!=head)
	{
		current=current.next;
	}
	current.next=newnode;
	newnode.next=head;
	head=newnode;
	totalElement++;
}
public void display()
{
	ListNode current=head;
	System.out.print(current.data+"-->");
	while(current.next!=head)
	{
		current=current.next;
		System.out.print(current.data+"-->");
	}
	System.out.println("Null");
}
public void deleteFirst()
{
	if(isEmpty())
	{
		System.out.println("Empty Circular Singly Linked List");
	}
	else
	{
		ListNode current= head;
		ListNode hold=head;
	while(current.next!=head)
	{
		current=current.next;
	}
	head=head.next;
	hold.next=null;
	current.next=head;
	totalElement--;
	}
}
public void deleteLast()
{
	if(isEmpty())
	{
		System.out.println("Empty Circular Singly Linked List");
	}
	else
	{
		ListNode current= head;
		ListNode hold=head;
	while(current.next!=head)
	{
		current=current.next;
	}
	while(hold.next!=current)
	{
		hold=hold.next;
	}
	
	hold.next=head;
	current.next=null;
	totalElement--;
	}
}
	public static void main(String[] args) {
		CircularSinglyLinkedList csll=new CircularSinglyLinkedList();

		csll.insertLast(10);
		csll.insertLast(20);
		csll.insertLast(30);
		csll.insertLast(40);
		csll.insertLast(50);
		csll.display();
		csll.totalElement();
		csll.insertFirst(60);
		csll.display();
		csll.totalElement();
		csll.deleteFirst();;
		csll.display();
		csll.totalElement();
		csll.deleteLast();;
		csll.display();
		csll.totalElement();
	}

}
