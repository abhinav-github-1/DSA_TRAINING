import java.util.*;
public class firstAndLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<String>> input=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<String> row=new ArrayList<>(); 
            for(int j=0;j<m;j++)
            {
                row.add(sc.next());
            }
            input.add(row);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println((input.get(i).get(0)).length()+" "+(input.get(i).get(m-1)).length());
        }
        
    }
}
