import java.util.Scanner;

class ArrSort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,j,t,n;
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements of array");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Elements of array before sorting are");
		for(i=0;i<n;i++)	
			System.out.print(a[i]+" ");
		System.out.print("\nSorting in descending order\n");
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(a[j]<a[j+1]){
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("Elements of array before sorting are");
		for(i=0;i<n;i++)	
			System.out.print(a[i]+" ");
	}
}
