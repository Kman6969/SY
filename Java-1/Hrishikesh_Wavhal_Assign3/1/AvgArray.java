import java.io.BufferedReader;
import java.io.InputStreamReader;

class AvgArray{
	public static void main(String args[]){
		try{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter number of elements: ");
		
		int n=0,i=0,sum=0,avg=0;
		n=Integer.parseInt(sc.readLine());
		int[] a=new int[n];
		System.out.println("Enter elements of array");
		
		for(i=0;i<n;i++){
			a[i]=Integer.parseInt(sc.readLine());
			sum=sum+a[i];
		}
		System.out.println("Elements of array are");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		avg=(sum/n);
		System.out.println("\nAverage is:"+avg);
		}catch(Exception e){
			System.out.println("Error handled");
		}
	}
}

		