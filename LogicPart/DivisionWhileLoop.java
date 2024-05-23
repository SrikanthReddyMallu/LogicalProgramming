package LogicPart;

public class DivisionWhileLoop
{
    public static void main(String[] args)
    {
        //Here we remove last letter every time and print remaining
        int n=8567;
        while(n!=0)
        {
            n=n/10;
            System.out.println(n);
        }

    }
}
