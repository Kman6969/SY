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
		System.out.println("Name is: "+pname+"\nAddress is: "+address+"\nMail ID is: "+email+"\nPhone number is: "+cell+"\nUID is: "+uid);
	}	
}
class TestPerson{
	public static void main(String args[]){
		final Person p1=new Person("Hrishikesh","Aundh","hrishikwavhal@gmail.com",955277,84513);
		p1.display();
		
	}
}
