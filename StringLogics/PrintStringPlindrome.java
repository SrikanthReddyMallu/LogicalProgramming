package StringLogics;

public class PrintStringPlindrome
{
    public static void main(String[] args)
    {
        String s1="level";
        char[] c=s1.toCharArray();
        String rev="";
        for(int i=c.length-1;i>=0;i--)
        {
            rev=rev+c[i];
        }
        if(rev.equals(s1))
        {
            System.out.println("polindrome");
        }
        else
        {
            System.out.println("Not a polindrome");
        }



//        String s = "arora";
//        String rev1 = "";
//        for (int i = s.length()-1; i >=0 ; i--)
//            rev1=rev1+s.charAt(i);
//        if(s.equals(rev1))
//            System.out.println("String is palindrome");
//        else
//            System.out.println("String is not palindrome");
    }
}
