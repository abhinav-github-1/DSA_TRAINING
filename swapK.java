import java.util.Scanner;
public class swapK
 {
    //swapping k elements
        public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int k=sc.nextInt();
       int [][] arr=new int [n][m];
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=sc.nextInt();
        }
       } 
       for(int i=0;i<n/2;i++)
       {
        int t=0;
        for(int j=m-k;j<m;j++)
        {
            int temp=arr[i][j];
            arr[i][j]=arr[n-1-i][t];
            arr[n-1-i][t]=temp;
            t++;
        }
       }
        for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
          System.out.println();
       } 
       sc.close();
    }
    
}
