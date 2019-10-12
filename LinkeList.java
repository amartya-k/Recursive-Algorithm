import java.util.Scanner;

class Node{
	protected int regd_no;
	protected float mark; 
	protected Node next;
	
}
public class LinkedList {
	static Node start=null,p,q,r;
	static Scanner sc=new Scanner(System.in);
	
  
  //Creating Linked List
  
	public static void create(){
		p=new Node();
		start=p;
		System.out.println("enter the registration number");
		p.regd_no=sc.nextInt();
		System.out.println("enter the marks");
		p.mark=sc.nextInt();
		p.next=null;
		System.out.println("do you want to add nerw node ");
		int option=sc.nextInt();
		while(option!=0){
		q=new Node();
		System.out.println("enter the registration number");
		q.regd_no=sc.nextInt();
		System.out.println("enter the marks");
		q.mark=sc.nextInt();
		q.next=null;
		p.next=q;
		p=q;
		System.out.println("do you want to enter if yes-1 if not -0 ");
		option=sc.nextInt();
		}
	}
	
  
  // Display the created linkde list
  
	public static void display(){
		Node ptr;
		ptr=start;
		System.out.println(" Displaying all details ");
		while(ptr!=null){
			System.out.println(ptr.regd_no);
			System.out.println(ptr.mark);
			ptr=ptr.next;
		}
	}
  
  // Search particular node
  
	public static void Search(){
		Node ptr;
		int flag=0;
		ptr=start;
		int key=sc.nextInt();
		while(ptr!=null){
			if(ptr.regd_no==key){
				flag=1;
				break;
			}
			ptr=ptr.next;
		}
		if(flag==1)
			System.out.println("Student marks is : "+ptr.mark);
		else
			System.out.println("Student not found!");
		
	}
  
  //Insert at the beggining
  
	public static void InsertBegin(){
		r=new Node();
		System.out.println("enter the registration ");
		r.regd_no=sc.nextInt();
		System.out.println("enter the mark");
		r.mark=sc.nextInt();
		r.next=null;
		if(start == null)
			{
			start=r;
			}
		else{
			r.next=start;
			start=r;
		}
	}
  
  // Insert after particular node
  
	public static Node InsertAfter(){
		Node p,curr;
		Scanner sc=new Scanner(System.in);
		curr=new Node();
		System.out.println("Enter registration number");
		return start;
	}
  
  //  Insert at end
  
	public static void InsertEnd(){
		Node ptr;
		ptr=start;
		r=new Node();
		System.out.println("enter the registration ");
		r.regd_no=sc.nextInt();
		System.out.println("enter the mark");
		r.mark=sc.nextInt();
		r.next=null;
		if(start == null)
			{
			start=r;
			}
		else{
			while(ptr.next!=null){
				ptr=ptr.next;
			}ptr.next=r;
		}
		
	}
  
  // Add node to any position
  
	public static Node InsertAny(){
		Node p,curr;
		Scanner sc=new Scanner(System.in);
		int count=1;
		curr=new Node();
		System.out.println("Enter the Registration number  ");
		curr.regd_no=sc.nextInt();
		System.out.println("Enter the marks ");
		curr.mark=sc.nextInt();
		curr.next=null;
		System.out.println("enter the location where you want to insert ");
		int loc=sc.nextInt();
		if(start==null){
			start=curr;
		}
		else{
			p=start;
			while(count<loc-1){
				p=p.next;
				count++;
			}
			curr.next=p.next;
			p.next=curr;
			
		}return start;
		
	}
  
  //Delete from beggining
  
	public static Node DeleteBegin(){
		Node p;
		p=start;
		if(start==null){
			System.out.println("Memory Overflow ");
			System.exit(0);
		}
		else{
			p=start;
			start=start.next;
			p.next=null;
		}return start;
	}
  
  //Delete at end
  
	public static void DeleteEnd(){
		Node p,q=null;
		if(start==null){
			System.out.println("memory Overflow");
			System.exit(0);
		}
		else{
			p=start;
			while(p.next!=null){
				q=p;
				p=p.next;
			}q.next=null;
		}
	}
  
  //Menu display to make it user friendly
  
  
  public static void main(String S[]){
		
		while(true){
			System.out.println("****MENU****");
			System.out.println("0:EXIT");
			System.out.println("1:CREATION");
			System.out.println("2:DISPLAY");
			System.out.println("3:SEARCH");
			System.out.println("4:INSERT AT BEGINNING OF THE LIST");
			System.out.println("5:INSERT AT END OF THE LIST");
			System.out.println("6:INSERT AT ANY POSITION OF THE LIST");
			System.out.println("7:DELETE AT BEGINNING OF THE LIST");
			System.out.println("8:DELETE AT END OF THE LIST");
	
			System.out.println("Enter the choice");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 0:
				System.exit(0);
				break;
			case 1:
				create();
				break;
			case 2:
				display();
				break;
			case 3:
				Search();
				break;
			case 4:
				InsertBegin();
				break;
			case 5:
				InsertEnd();
				break;
			case 6:
				InsertAny();
				break;
			case 7:
				DeleteBegin();
				break;
			case 8:
				DeleteEnd();
				break;
			default:
				System.out.println("Wrong Choice");
			}
	
		}
		
	}
}
