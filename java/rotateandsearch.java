import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class rotateandsearch
{
    public static void main(String[] args) 
    {
		int x,y=0,pivot=0,mid,max,min,z;
        Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr[] = new int[n];
		int item=scan.nextInt();
		for(x=0;x<n;x++)
		{
		arr[x]=scan.nextInt();
		}
	
		for(x=0;x<n-1;x++)
		{
			if(arr[x]>arr[x+1])
			{
				pivot=x+1;
				//System.out.println(pivot);
				break;
			}
		}
		int arr_left[] = new int[pivot];
		int arr_ryt[] = new int[2];
		for(x=0;x<pivot;x++)
		{
			arr_left[x]=arr[x];
			System.out.print(arr_left[x]);
		}
		for(z=pivot;z<n;z++)
		{
			arr_ryt[y]=arr[z];
			//System.out.print(arr_ryt[y]);
			y++;
		}
		for(x=0;x<arr_left.length;x++)		
		{
			System.out.print(arr_left[x]);
		}
		for(x=0;x<arr_ryt.length;x++)		
		{
			System.out.print(arr_ryt[x]);
		}
	
		if(item>=arr_left[0])
		{	
	
		min=arr_left[0];
		max=arr_left.length;
		
		while(min<=max)
			
		{
			mid=(min+max)/2;
			if(arr_left[mid]==item)
			{
				System.out.print(min);
				System.out.print(max);
				System.out.println(mid);
			}
			else if(item<arr_left[mid])
			{
				if(item<arr_left[mid] && item>=min)
				{
					max=mid-1;
				}
				else
				{
					min=mid+1;
				}
			}
			else if(item>arr_left[mid])
			{
				if(item>arr_left[mid] && item<=max)
				{
					min=mid+1;
				}
				else
				{
					max=mid-1;
				}
			}
		}
		}
		else 
		{
		min=arr_ryt[0];
		max=arr_ryt.length;
			while(min<=max)
			{
			mid=(min+max)/2;
			if(arr_ryt[mid]==item)
				System.out.println(mid);
			else if(item<arr_ryt[mid])
			{
				if(item<arr_ryt[mid] && item>=min)
				{
				max=mid-1;
				}
				else
				{
					max=mid-1;
				}
			}
			else if(item>arr_ryt[mid])
			{
				if(item>arr_ryt[mid] && item<=max)
				{
					max=mid-1;
				}
				else
				{
					max=mid-1;
				}
			}
			}
		}	
	}
}
		
	
