import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class dupliRemoval
{
    public static void main(String[] args) 
    {
		int x,y=0;
        Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int temp[]= new int[n];
		int arr[] = new int[n];
		for(x=0;x<n;x++)
		{
			arr[x]=scan.nextInt();
		}
		for(x=0;x<n-1;x++)
		{
			if(arr[x]!=arr[x+1])
			{
				temp[y]=arr[x];
				y++;
			}
		}
		temp[y]=arr[n-1];
		for(x=0;x<n;x++)
		{
			System.out.print(temp[x]);
		}
		
	}
}

		
	