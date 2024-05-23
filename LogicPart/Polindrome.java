package LogicPart;

public class Polindrome
{
    public static void main(String[] args)
    {
        int n=22022;
        int rem=0;
        int sum=0;
        int rev=0;
        int n1=n;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            rev=(rev*10)+rem;
        }
        if(n1==rev)
        {
            System.out.println("Polindrome");
        }
        else
        {
            System.out.println("Not a plindrome");
        }
    }
}
