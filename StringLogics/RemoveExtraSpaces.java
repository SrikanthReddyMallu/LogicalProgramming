package StringLogics;

public class RemoveExtraSpaces
{
    public static void main(String[] args)
    {
        String s1="hello   hii     welcome     to the        world";
        char[] c=s1.toCharArray();
        String s2=" ";
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==' ')
            {
                if(c[i+1]==' ')
                {
                    s2=s2+"";
                }
                else
                {
                    s2=s2+c[i];
                }
            }
            else
            {
                s2=s2+c[i];
            }
        }
        System.out.println(s2);
    }
}
