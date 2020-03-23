import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class CountZerOne
{
    public static void main(String[] args) 
    {
		int x,count=0,max=0;
        Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int arr[] = new int[n];
		for(x=0;x<n;x++)
		{
			arr[x]=scan.nextInt();
		}
		for(x=0;x<n;x++)
		{
			if(arr[x]==m)
			{
				count++;
				if(max<=count)
				{
					max=count;
				}
			}
			
			else
			{
				count=0;
			}
		}
		System.out.print(max);
	}
}
	