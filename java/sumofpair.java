import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class sumofpair
{
    public static void main(String[] args) 
    {
		int x,y,sum;
        Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int d=scan.nextInt();
		int arr[] = new int[n];
		for(x=0;x<n;x++)
		{
		arr[x]=scan.nextInt();
		}
		for(x=0;x<n;x++)
		{
			for (y=x;y<n;y++)
			{
				sum=arr[x]+arr[y];
				if(sum==d)
				{
				System.out.println("true");
				}
			}
		}
	}

}