import java.util.Scanner;
class Array{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		int[] a= new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int[] b=new int[n];
		int[] c=new int[n];
		for(i=0;i<n;i++){
			if(a[i]%2==0)
				b[i]=a[i];
			else 
				c[i]=a[i];
		}
		System.out.print("Original array is ");
		for(i=0;i<n;i++){
			System.out.println(a[i]+"\t");
		}
		System.out.println("Even array is ");
		for(i=0;i<n;i++){
			System.out.print(b[i]+"\t");
		}
		System.out.print("odd array is ");
		for(i=0;i<n;i++){
			System.out.print(c[i]+"\t");
		}
	}
}
