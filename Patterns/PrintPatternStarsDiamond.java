package Patterns;

public class PrintPatternStarsDiamond
{
    public static void main(String[] args)
    {
        int n=5;
        int p=4;
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i=p;i>=1;i--)
        {
            for (int j=0;j<=p-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
