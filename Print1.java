import java.util.*;
public class Print1
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int n,maxi=0,mini=0;;
	    n=s.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=s.nextInt();
	    int max=Integer.MIN_VALUE;
	    int min=Integer.MAX_VALUE;
	    for(int i:arr)
	    {
	        if(i<min)
	        min=i;
	        if(i>max)
	        max=i;
	    }
	    System.out.println(min+" "+max);
	   for(int i=0;i<n;i++)
	   {
	       if(min==arr[i])
	       {
	       mini=i;
	       break;
	       }
	   }
	   for(int i=0;i<n;i++)
	   {
	       if(max==arr[i])
	       {
	       maxi=i;
	       break;
	       }
	   }
	    System.out.println(mini+" "+maxi);
	   if(mini<maxi)
	   {
	       for(int i=mini;i<maxi;i++)
	       System.out.print(arr[i]+"");
	        for(int i=0;i<mini;i++)
	       System.out.print(arr[i]+"");
	        for(int i=maxi;i<n;i++)
	       System.out.print(arr[i]+"");
	   }
	    if(maxi<mini)
	   {
	       for(int i=maxi;i<mini;i++)
	       System.out.print(arr[i]+"");
	        for(int i=0;i<maxi;i++)
	       System.out.print(arr[i]+"");
	        for(int i=mini;i<n;i++)
	       System.out.print(arr[i]+"");
	   }
	
	}
}