import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class rotation
{
    public static void main(String[] args) 
    {
		int x,y,temp;
        Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int arr[] = new int[n];
		for(x=0;x<n;x++)
		{
		arr[x]=scan.nextInt();
		}
		for(x=0;x<m;x++)
		{
			for (y=0;y<n-1;y++)
			{
				temp=arr[y];
				
				arr[y]=arr[y+1];
				
				arr[y+1]=temp;
				
			}
		}
		for(x=0;x<n;x++)		
		{
			System.out.println(arr[x]+" ");		
		}
		
	}

}