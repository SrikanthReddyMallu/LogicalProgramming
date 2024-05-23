package LogicPart;

public class Recursive10To1
{
    public static void demo(int n)
    {
        if(n>=1)
        {
            System.out.println(n);
            demo(n-1);
        }
    }


    public static void main(String[] args) {
        demo(10);
    }
}
