package LogicPart;

public class RemainderSumOfDigitsIsPrimeOrNot
{
    public static void main(String[] args)
    {
        int n=124;
        int rem=0;
        int sum=0;
        while(n!=0)
        {
          rem=n%10;
          sum=sum+rem;
          n=n/10;
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
            System.out.println("prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }

}
