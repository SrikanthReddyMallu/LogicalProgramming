package StringLogics;

public class BalancingBrackets
{
    public static void main(String[] args)
    {
        String s1="))))((((";
        char[] c=s1.toCharArray();
        int c1=0;
        int c2=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==')')
            {
                c1++;
            }
            else if(c[i]=='(')
            {
                c2++;
            }
        }
        if(c1==c2)
        {
            System.out.println("Brackets balance");
        }
        else
        {
            System.out.println("Brackets unbalance");
        }
    }
}
