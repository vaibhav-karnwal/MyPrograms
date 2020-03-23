import java.util.*;
class reverse
{
public static void main(String []args)
{
int x,n,y;

Scanner scan= new Scanner(System.in);
n=scan.nextInt();
int arr[]=new int[n];
for(x=0;x<n;x++)
{
	arr[x]=scan.nextInt();
}
for(y=n-1;y>=0;y--)
{
	System.out.print(arr[y]+" ");
}		
}
}
