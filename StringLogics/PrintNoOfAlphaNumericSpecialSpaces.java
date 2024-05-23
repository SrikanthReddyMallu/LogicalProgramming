package StringLogics;

public class PrintNoOfAlphaNumericSpecialSpaces
{
    public static void main(String[] args)
    {
        String s1="srikanth.mallu  3@gmail.com";
        char[] c=s1.toCharArray();
        int alph=0;
        int num=0;
        int spe=0;
        int space=0;
        for(int i=0;i<c.length;i++)
        {
            char ch=c[i];
            if((ch>='a' && ch<='z') && (ch>='A' || ch<='Z'))
            {
                alph++;
            }
            else if(ch>='0' && ch<='9')
            {
                num++;
            }
            else if(ch==' ')
            {
                space++;
            }
            else
            {
                spe++;
            }
        }
        System.out.println(alph);
        System.out.println(num);
        System.out.println(space);
        System.out.println(spe);
    }
}
