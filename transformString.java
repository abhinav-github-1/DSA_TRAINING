import java.util.*;
public class transformString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        String sp="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)||Character.isDigit(ch))
            {
              res+=ch;
              continue;
            }
            else if(Character.isUpperCase(ch))
            {
            ch= Character.toLowerCase(ch);
            res=res+ch;
            }
            else
            sp+=ch;
        }
        System.out.println(res+sp);
    }
}
