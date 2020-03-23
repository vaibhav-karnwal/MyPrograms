import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class MajorityElement
{
    public static void main(String[] args) 
    {
		int x,y,count=0,index=0,max_so_far=0;
        Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]={3, 3, 4, 2, 4, 4, 2, 4};
		/*int arr[] = new int[n];
		for(x=0;x<n;x++)
		{
			arr[x]=scan.nextInt();
		}*/
		
		for(x=0;x<n;x++)
		{
			for(y=0;y<n;y++)
			{
				if(arr[x]==arr[y])
				{
					count++;
				}
			}
			if(count>max_so_far)
			{
				max_so_far=count;
				index=x;
			}
		}
		if(max_so_far>n/2)
		{
			System.out.println(arr[index]);
		}
		else
		{
			System.out.println("No Majority Element");
		}
	}
}