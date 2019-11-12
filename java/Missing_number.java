import java.util.Scanner;
class Missing_number
{
public static void main(String []args)
{
int n;
Scanner number=new Scanner(System.in);
System.out.print("Enter the numbers");
n=number.nextInt();
int a[]=new int[n];
System.out.print("Enter all the numbers");
for(int i=0;i<n;i++)
{
	a[i]=number.nextInt();
}
for(int j=0;j<n;j++)
{
	int min_no=a[j];
	for(int z=j;z<n;z++)
{
	if(a[min_no]>a[z+1]);
	{
		int temp=a[min_no];
		a[min_no]=a[z+1];
		a[z+1]=temp;
	}
	{
		j++;
	}
}
}
for(int x=0;x<n;x++)
	System.out.print(a[x]+" ");
}
}

