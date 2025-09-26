import java.util.*;
public class KRotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            res+=ch;
            else
            k+=Math.pow(ch-'0',2);
        }
        // System.out.println(res);
        int n=res.length();
        k=k%n;
        // System.out.println(k);
        if(k%2!=0)
        {
            String lr=res.substring(k,n-k)+res.substring(0, k);
            System.out.println(lr);
        }
        else
        {
            String rr=res.substring(n-k,n)+res.substring(0, n-k);
            System.out.println(rr);
        }
sc.close();
    }
}
