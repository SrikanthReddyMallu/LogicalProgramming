package LogicPart;

public class RemainderFactorialOfEachDigitIsEqualToSameNumberIsStringNumber
{
    //5!=1*2*3*4*5=120
    public static void main(String[] args)
    {
        int n=145;
        int n1=n;
        int rem=0;
        int sum=0;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            int fact=1;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
        }
        if(sum==n1)
        {
            System.out.println("strong number");
        }
        else
        {
            System.out.println("Not a strong number");
        }
    }
}
