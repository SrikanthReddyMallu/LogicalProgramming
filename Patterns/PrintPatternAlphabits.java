package Patterns;

public class PrintPatternAlphabits
{
    public static void main(String[] args)
    {
        int n=5;
        int alph=65;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print((char) (alph+k)+" ");
            }
            System.out.println();
        }
    }
}
