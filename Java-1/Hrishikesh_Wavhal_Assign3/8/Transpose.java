import java.util.Scanner;
class Transpose{
	public static void main(String args[]){
		int i,j,m,n;
		System.out.println("Enter number or rows and columns");
		Scanner sc=new Scanner(System.in);
	
		m=sc.nextInt();
		n=sc.nextInt();
	
		int[][] a=new int[m][n];
		int[][] t=new int[100][100];
	
		System.out.println("Enter elements of first array");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=sc.nextInt();
	
		System.out.print("\nElements of array are\n");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
	//transpose logic	
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				t[i][j]=a[j][i];
		
		System.out.print("\nTranspose of array is\n");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(t[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
