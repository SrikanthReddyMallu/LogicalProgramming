package LogicPart;

public class RemainderLastFourDigitsIsPrimeOrNot
{
    public static void main(String[] args)
    {
        int n=987651321;
        int rem=0;
        int sum=0;
        int j=1;
        while(j<=4)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
            j++;
        }
        int count=0;
        for(int i=1;i<=sum;i++)
        {
            if(sum%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("Last four digits is prime");
        }
        else
        {
            System.out.println("Last four digits is not a prime");
        }
    }
}
