import java.util.*;
public class leftRight{
    //try to use formula for left and right rotation
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    sc.nextLine();
    String s=sc.nextLine();
    //Left Rotation
    // String lr=s.substring(k,n-k)+s.substring(0, k);
    // System.out.println(lr);
// Formula should be applied if necessary

    //Right Rotation
    k=k%n;
    String rr=s.substring(n-k,n)+s.substring(0, n-k);
    System.out.println(rr);
}
}

