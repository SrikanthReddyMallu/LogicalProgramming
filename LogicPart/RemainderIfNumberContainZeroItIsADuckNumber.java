package LogicPart;

public class RemainderIfNumberContainZeroItIsADuckNumber
{
    public static void main(String[] args)
    {
        int n=2024;
        int rem=0;
        boolean flag = false;
        while(n!=0)
        {
            rem=n%10;
            if(rem==0)
            {
                flag=true;
                break;
            }
            n=n/10;
        }
        if(flag==false)
        {
            System.out.println("Not present any zero number");
        }
        else
        {
            System.out.println("present zero number");
        }
    }
}
