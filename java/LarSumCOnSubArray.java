import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class LarSumCOnSubArray
{
    public static void main(String[] args) 
    {
		int x,count=0,max_so_far=0,sum_at_end=0;
        Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr[] = new int[n];
		for(x=0;x<n;x++)
		{
			arr[x]=scan.nextInt();
		}
		
		for(x=0;x<n;x++)
		{
			sum_at_end+=arr[x];
			if(sum_at_end>=0 && sum_at_end>=max_so_far)
			{
				max_so_far=sum_at_end;
			}
			else if(sum_at_end<=0)
			{
				sum_at_end=0;
			}
			else
			{
				sum_at_end=sum_at_end;
			}
		}
		System.out.print(max_so_far);
	}
}
	