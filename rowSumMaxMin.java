import java.util.*;
public class rowSumMaxMin {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int [][] arr=new int [n][m];
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=sc.nextInt();
        }
       } 
       for(int i=0;i<n;i++)
       {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int j=0;j<m;j++)
        {
            sum+=arr[i][j];
            max=Math.max(max,arr[i][j]);
            min=Math.min(min,arr[i][j]);
        }
        System.out.println(sum+" "+max+" "+ min);
       }
    }
}
