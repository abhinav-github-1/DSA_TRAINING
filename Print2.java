import java.util.*;
public class Print2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n,m;
        int maxi =0;
        int mini=0;;
	    m=sc.nextInt();
	    n=sc.nextInt();
	    int[] a=new int[m];
	    int[] b=new int[n];
	    for(int i=0;i<m;i++)
	    a[i]=sc.nextInt();
	     for(int i=0;i<n;i++)
	    b[i]=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int count=0;
	        for(int j=0;j<m;j++)
	        {
	            if(b[i]<a[j])
	            count++;
	        }
	        System.out.print(count+"");
	    }
	}
}
