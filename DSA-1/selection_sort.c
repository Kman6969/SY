#include<stdio.h>
void accept(int a[],int n)
{
	int i;
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);

}
void display(int a[],int n)
{
	int i;
	for(i=0;i<n;i++)
		printf("%d ",a[i]);
}
void sort(int a[],int n)
{
	int i,j,t,min;
	for(i=0;i<n-1;i++)
	{
		min=i;
		for(j=i+1;j<n;j++)
		{
			if(a[min]>a[j])
				min=j;

		}
		t=a[i];
		a[i]=a[min];
		a[min]=t;
	}
}
int main()
{
	int a[20],n;
	printf("\nEnter how many numbers\n");
	scanf("%d",&n);
	printf("\nEnter elements of array");
	accept(a,n);
	printf("---Elements before swapping are---\n");
	display(a,n);
	printf("\n---Elements after swapping are---\n");
	sort(a,n);
	display(a,n);
	printf("\n");
	return 0;
}