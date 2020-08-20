import java.util.Scanner;

class Person{
	private static String pname,address,email;
	private static long cell,uid;
	
	public static void accept(String name,String addr,String mail,long pno,long id){
		pname=name;
		address=addr;
		email=mail;
		cell=pno;
		uid=id;
	}
	public static void display(){
		System.out.println("Name is: "+pname+"\nAddress is: "+address+"\nMail ID is: "+email+"\nPhone number is: "+cell+"\nUID is: "+uid+"\n");
	}	
}
class TestPerson{
	public static void main(String args[]){
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of entries");
		n=sc.nextInt();
		
		String name,addr,mail;
		long pno,id;
		
		for(i=0;i<n;i++){
			System.out.println("Enter name(string),address(string),email(string),cell(long),uid(long) of person "+(i+1));
			
			name=sc.next();
			addr=sc.next();
			mail=sc.next();
		
			pno=sc.nextLong();
			id=sc.nextLong();
			
			Person.accept(name,addr,mail,pno,id);
			Person.display();
		}
		System.out.println("\nTotal number of entries is "+n);
		
	}
}