import java.util.Scanner;
class MtoK{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float n,km;
		System.out.println("Enter distance in miles: ");
		n=sc.nextFloat();
		km=(1.609f)*(n);
		System.out.println("Distance in kilometers is "+km);
	}
}