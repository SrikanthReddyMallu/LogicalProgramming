package StringLogics;

public class PrintReverseOnlyAlphabets
{
    public static void main(String[] args)
    {
        String s1="12#AC&KL";
        char[] c=s1.toCharArray();
        String s2=" ";
        String s3=" ";
        for(int i=c.length-1;i>=0;i--)
        {
            char ch=c[i];
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                s2=s2+ch;
            }
        }
        int k=1;
        for(int i=0;i<c.length;i++)
        {
            char ch1=c[i];
            if ((ch1>='a' && ch1<='z') || (ch1>='A' && ch1<='Z'))
            {
                s3=s3+s2.charAt(k);
                k++;
            }
            else
            {
                s3=s3+ch1;
            }
        }
        System.out.println(s3);
    }
}
