import java.util.*;
public class charactersFromPaired {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        List<String> list=new ArrayList<>(Arrays.asList(s.split(" ")));
        for(int i=0;i<n/2;i++)
        {
            System.out.print(list.get(i).substring(0,i+1)+list.get(list.get(i).length()-i-1).substring(list.get(i).length()-i-1,i+1)+ " ");
        }
         
    }
    
}
