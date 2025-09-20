import java.util.*;
public class maxSubarraySum {
    //kadane's algorithm
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        // int res=0;
        // for(int i=0;i<n-1;i++)
        // {
        //     int sum=arr[i];
        //     for(int j=i+1;j<n;j++)
        //     {
        //         sum+=arr[j];
                
        //     }
        //     res=Math.max(sum,res);
        // }
        // System.out.println(res);

        //Kadane's Algorithm
        int res=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            max=Math.max(max+arr[i],arr[i]);
            res=Math.max(max,res);
        }
        System.out.println(res);
    }
}
