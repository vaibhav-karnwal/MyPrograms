import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class rotatecount
{
    public static void main(String[] args) 
    {
		int x,y,temp,count=0,i=1;
		int giv_arr[]={3,4,1,2};
        Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr[] = new int[n];
		for(x=0;x<n;x++)
		{
		arr[x]=scan.nextInt();
		}
		while(i<n)
		{
			for (y=0;y<n-1;y++)
			{
				temp=arr[y];
				arr[y]=arr[y+1];
				arr[y+1]=temp;
			}	
			count++;
			
			for(x=0;x<n;x++)
			{
				System.out.print(arr[x]);
			}
			if(Arrays.equals(arr, giv_arr))
			{
				break;
			}
			i++;
		}
		System.out.println(count+" ");
	}
}