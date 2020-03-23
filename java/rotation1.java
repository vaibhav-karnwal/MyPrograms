import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class rotation1
{
    public static void main(String[] args) 
    {
		int x,y,i=0,z,temp[];
        Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int d=scan.nextInt();
		int arr[] = new int[n];
		z=d;
		for(x=0;x<n;x++)
		{
			arr[x]=scan.nextInt();
		}
		for(x=0;x<n-d;x++)
		{
			temp[x]=arr[z];
			z++;
		}
		for(y=d+1;y<n;y++)
		{
			temp[y]=arr[i];
			i++;
		}
		for(x=0;x<n;x++)		
		{
			System.out.println(arr[x]+" ");		
		}
		
	}

}