import java.util.*;
public class leftRight{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    sc.nextLine();
    String s=sc.nextLine();
    String lr=s.substring(k,n-k)+s.substring(0, k);
    System.out.println(lr);
}
}

