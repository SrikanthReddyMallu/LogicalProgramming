package Patterns1;

public class RhombusPattern8
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
