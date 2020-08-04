import java.util.Scanner;
class MaxArray{
  public static void main(String args[]){
    int n,i,max;
    System.out.println("Enter number of elements: ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] a=new int[n];
	System.out.println("Enter elements of array");
    
    for(i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	max=a[0];
	for(i=1;i<n;i++){
		if(max<a[i])
			max=a[i];
	}
	System.out.print("\nMaximum number in the array is : "+max);
  }
}