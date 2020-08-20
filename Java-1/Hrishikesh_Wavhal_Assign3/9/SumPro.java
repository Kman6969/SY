import java.util.Scanner;
class SumPro{
	public static void main(String args[]){
		int i,n,sum=0,pro=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		
		n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Enter elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Elements of array are");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
	//sum & product
		for(i=0;i<n;i++){
			sum=sum+a[i];
			pro=pro*a[i];
		}
		System.out.println("\nSum of elements of array is:"+sum);
		System.out.println("\nProduct of elements of array is:"+pro);
	}
}

			
		