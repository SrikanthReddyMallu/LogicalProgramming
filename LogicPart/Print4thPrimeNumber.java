package LogicPart;

public class Print4thPrimeNumber
{
    public static boolean getNum(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        int key=4;
        int c=0;
        for(int i=1;i<=100;i++)
        {
            boolean ans=getNum(i);
           if(ans==true)
            {
                c++;
            }
            if(c==key)
            {
                System.out.println(i);
                break;

            }
        }
    }

}
