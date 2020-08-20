import java.util.Scanner;

class AddMat{
	public static void main(String args[]){
		int m,n,i,j;
		System.out.println("Enter number of rows and columns of matrices");
		Scanner sc=new Scanner(System.in);
		//m=sc.nextInt();
		n=sc.nextInt();
		
		int[][] a=new int[n][n]; 
		int[][] b=new int[n][n];
		int[][] sum=new int[n][n];
		
		System.out.println("Enter elements of first array");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=sc.nextInt();
			
		System.out.println("Enter elements of second array");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				b[i][j]=sc.nextInt();
			
		System.out.print("Elements of first array are\n");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}	
		System.out.print("Elements of second array are\n");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.print("\n");
		}	
		System.out.println("Addition of a and b is");
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				sum[i][j]=a[i][j]+b[i][j];
	
		System.out.print("\n");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(sum[i][j]+"\t");
			}
			System.out.print("\n");
		}	
		
	}
}