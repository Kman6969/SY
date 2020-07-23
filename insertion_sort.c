#include<stdio.h>

void scanarr(int a[], int n)
{
	int i;
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
}
void printarr(int a[],int n)
{
	int i;
	for(i=0;i<n;i++)
		printf("%d ",a[i]);
}

void insort(int a[],int n)
{
	int i,j,temp;
	for(i=1;i<n;i++)
	{
		a[i]=temp;
		for(j=i-1;j>=0;j--)
		{
			if(a[j]>temp)
				a[j+1]=a[j];
			else
				break;
			
		}
		a[j+1]=temp;
	}
	
}

int main()
{
	int a[50],n;
	printf("enter number of elements");
	scanf("%d");
	printf("\nEnter the elements:");
	scanarr(a,n);
	printf("\nArray before sorting is:\n");
	printarr(a,n);
	insort(a,n);
	printf("\nArray after sorting is:\n");
	printarr(a,n);
	return 0;
}