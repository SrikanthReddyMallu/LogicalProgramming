package StringLogics;

public class PrintNameReverse
{
    public static void main(String[] args)
    {
//        String s1="Srikanth";
//        char[] c=s1.toCharArray();
//        for(int i= c.length-1;i>=0;i--)
//        {
//            System.out.print(c[i]);
//        }

        String s1="Srikanth";
        char[] c=s1.toCharArray();
        String s2="";
        for(int i= c.length-1;i>=0;i--)
        {
            s2=s2+c[i];
        }
        System.out.println(s2);
    }
}
