import java.util.*;
public class countOfInstances {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        for(int i=0;i<n;i++)
        {
            int cnt=0;
            if(s2.contains(String.valueOf(s1.charAt(i))))
            {
            cnt++;
            }
            System.out.print(cnt+" ");
        }
    }
    
}
