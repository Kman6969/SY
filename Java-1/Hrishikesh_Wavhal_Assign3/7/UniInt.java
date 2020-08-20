import java.io.BufferedReader;
import java.io.InputStreamReader;

class UniInt{
	public static void main(String args[]){
		try{
			BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
			int n=0,m=0,i=0,j=0;
			System.out.println("Enter number of elements of first array: ");
			n=Integer.parseInt(sc.readLine());
			int []a=new int[n];
			System.out.println("\nEnter number of elements of second array: ");
			m=Integer.parseInt(sc.readLine());
	
			int []b=new int[m];
	
			System.out.println("Enter elements of first aray");
			for(i=0;i<n;i++)
				a[i]=Integer.parseInt(sc.readLine());
		
			System.out.println("Enter elements of second aray");
			for(j=0;j<m;j++)
				b[j]=Integer.parseInt(sc.readLine());
			
			System.out.println("Intersection is");	
			for(i=0;i<n;i++){
				for(j=0;j<m;j++){
					if(a[i]==b[j]){
						System.out.println(a[i]+" ");
						break;
					}
				}
			}
			
		}catch(Exception e){
				System.out.println("Errors handled");
			}
		
	}
}