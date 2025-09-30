import java.util.Scanner;

public class singledigitsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int cal=digitSum(n)*k;
        // int cntdigits=0;
        // System.out.println(cal);
        int ans=0;
        while(cal>0)
        {
            int x=cal%10;
            ans+=x;
            cal/=10;
        }
        System.out.println(ans);
        sc.close();
    }
    static int digitSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int x=n%10;
            sum+=x;
            n/=10;
        }
        return sum;
    }
}
