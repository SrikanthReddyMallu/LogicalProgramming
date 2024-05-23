package LogicPart;

public class Recursive1To10
{
     static void demo(int n)
    {
        if(n<=10)
        {
            System.out.println(n);
            demo(n+1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting");
        demo(1);
        System.out.println("Ending");
    }
}
