package Loops;

public class ForLoopPrimeNumbers
{
    public static void main(String[] args)
    {
        int n=17;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("primeNumber");
        }
        else
        {
            System.out.println("Not a prime number");
        }

    }

}
