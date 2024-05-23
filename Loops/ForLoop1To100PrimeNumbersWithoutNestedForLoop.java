package Loops;

public class ForLoop1To100PrimeNumbersWithoutNestedForLoop
{
    static Boolean getPrime(int i)
    {
        int count=0;
        for(int j=i;j>=1;j--)
        {
            if(i%j==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else
          return false;
    }
    public static void main(String[] args) {
     int n=100;
     for (int i=1;i<=n;i++)
     {
         boolean ans=getPrime(i);
         if(ans==true)
         {
             System.out.println(i);
         }
     }
    }

}
