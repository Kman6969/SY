import java.util.Scanner;
class ArrayRange{
	public static void main(String args[]){
		int i,n,max,min,range;
		System.out.println("Enter number of elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
	}
	max=a[0];
	for(i=0;i<n;i++){
		if(max<a[i])
			max=a[i];
	}
	min=a[0];
	for(i=0;i<n;i++){
		if(min>a[i])
			min=a[i];
	}
	range=(max-min);
	System.out.println("Maximum is: "+max);
	System.out.println("Minimum is: "+min);
	System.out.println("Range of aray is:"+range);
	
	}
}