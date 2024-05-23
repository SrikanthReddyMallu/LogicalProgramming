package Array;

public class CheckSumOfArrayIsPrimeNumberAndArmStrong4
{
    public static void main(String[] args) {
       // int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] arr={100,50,3};
        int size = arr.length;
        int sum = 0;
        int sum1=0;
        int c=0;
        int n1=sum;
        int rem = 0;
        for (int i = 0; i < size; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array is="+sum);

        //checking prime number
        for(int i=1;i<=sum;i++)
        {
            if(sum%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }

        //Checking ArmStrong number
        while (sum!=0)
        {
            rem=sum%10;
            int sumSize= CheckSumOfArrayIsPrimeNumberAndArmStrong4.getSize();
            int pow=1;
            for(int i=1;i<=sumSize;i++)
            {
                pow=pow*rem;
            }
            sum1=sum1+pow;
            sum=sum/10;
        }
        if(n1==sum1)
        {
            System.out.println("ArmStrong Number");
        }
        else
        {
            System.out.println("Not a ArmStrong Number");
        }
    }
    public static int getSize()
    {
        int n2=450;
        int c1=0;
        while(n2!=0)
        {
            c1++;
            n2=n2/10;
        }
        return c1;
    }
}
