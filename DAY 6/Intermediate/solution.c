#include<stdio.h>
#include<math.h>
#include<stdbool.h>
int prime(int n);
int main()
{
	int n;
	printf("Enter the range of prime numbers: ");
	scanf("%d",&n);
	printf("The prime numbers below or equals to %d are \n",n);
	prime(n);
}
int prime(int n)
{
	char a[n+1];
	int i,p,k;
	if(n<2)
		printf("NO PRIME NUMBERS");
	else
	{
		for(i=1; i<=n; i++)
			a[i]=true;
		a[0]=a[1]=NULL;
		p=sqrt(n);
		for(i=4; i<=n; i++)
		{
		  if(i!=5){
			k=2;
			while(k<=p)
			{
				if(i%k==0)
					a[i]=false;
				    k++;
			}
		  }
		}
	}
	for(i=2; i<=n; i++)
	{
		if(a[i]==true)
			printf("%d\n",i);
	}

}