#include<stdio.h>
void readarray(int a[],int n)
{
	int i;
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
}
void printarray(int a[],int n)
 {
 	int i;
 	printf("\n");
 	for(i=0;i<n;i++)
		printf("%d\t",a[i]);
	printf("\n");
 }
void bubblesort(int a[],int n)
 {
 	int temp=0,i,j;
 	for(i=1;i<n;i++)
 	{
 		for(j=0;j<n-i;j++)
 		{
 			if(a[j]>a[j+1])
 			{
 				temp=a[j];
 				a[j]=a[j+1];
 				a[j+1]=temp;

 			}
 		}
 	}
 }

int main()
 {
 	int a[20],n;
 	printf("\nEnter number of elements");
 	scanf("%d",&n);
 	readarray(a,n);
 	printarray(a,n);
 	bubblesort(a,n);
 	printarray(a,n);
 	return 0;
 }