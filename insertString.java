import java.util.*;
public class insertString {
    public static void main(String[] args) {
        //insert string
        Scanner sc=new Scanner (System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=sc.nextInt();
        String res="";
        for(int i=0;i<s1.length();i++)
        {
            if(i%n==0&&i!=0)
            res+=(s2+s1.charAt(i));
            else
            res+=s1.charAt(i);
        }
        System.out.println(res);
         

    }
    
}
