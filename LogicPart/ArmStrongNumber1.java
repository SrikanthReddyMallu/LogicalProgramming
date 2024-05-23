package LogicPart;

public class ArmStrongNumber1
{
    public static int hello()
    {
        int n=153;
        int c=0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        return c;
    }
    //153= here three digits are present so we will factorial of each digit is three times
    public static void main(String[] args)
    {
        int n=153;
        int rem=0;
        int sum=0;
        int n1=n;
        int c=ArmStrongNumber1.hello();
        while(n!=0)
        {
            rem=n%10;
            int pow=1;
            for(int i=1;i<=c;i++)
            {
                pow=pow*rem;
            }
            sum=sum+pow;
            n=n/10;
        }
        if(n1==sum)
        {
            System.out.println("ArmStrongNumber");

        }
        else
        {
            System.out.println("Not a ArmStrong number");
        }

    }
}
