import java.util.*;
public class StringReverse
{
    public static void main(String x[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    String str=sc.nextLine();
    StringBuilder ans=new StringBuilder();
    for(int i=str.length()-1;i>=0;i--)
    {
        ans.append(str.charAt(i));
    }
    System.out.println("String Reverse:"+ans);
    }
}