import java.util.Scanner;

class Person{
	private String pname,address,email;
	private long cell,uid;
	
	public Person(){
	
	}
	
	public Person(String name,String addr,String mail,long pno,long id){
		pname=name;
		address=addr;
		email=mail;
		cell=pno;
		uid=id;
		
	}

	public void display(){
		System.out.println(""+pname+"\t"+address+"\t"+email+"\t"+cell+"\t"+uid);
	}	
	
	public static void sortPhone(Person p[],int n){
		int i,j;
		Person t;
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(p[i].cell>p[j].cell){
					t=p[i];
					p[i]=p[j];
					p[j]=t;
				}
			}
		}
	}
	public static void sortName(Person p[],int n){
		int i,j;
		Person t;
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(((p[i].pname).compareTo((p[j].pname))>0)){
					t=p[i];
					p[i]=p[j];
					p[j]=t;
				}
			}
		}
	}
}
 
class TestPerson{
	public static void main(String args[]){
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of people");
		n=sc.nextInt();
		
		Person[] p=new Person[n];
		String name,addr,mail;
		long pno,id;
		
		for(i=0;i<n;i++){
			System.out.println("Enter name(string),address(string),email(string),cell(long),uid(long) of person "+(i+1));
			
			name=sc.next();
			addr=sc.next();
			mail=sc.next();
		
			pno=sc.nextLong();
			id=sc.nextLong();
			
			p[i]=new Person(name,addr,mail,pno,id);
		
		}
		System.out.println("\n\nBefore Sorting\n\n");
		for(Person t1:p)
			t1.display();
		
		System.out.println("\n\nSorting with Phone number\n\n");
		
		Person.sortPhone(p,n);
		for(Person t2:p)
			t2.display();
		
		System.out.println("\n\nSorting with name\n\n");
		
		Person.sortName(p,n);
		for(Person t2:p)
			t2.display();
	}
}

