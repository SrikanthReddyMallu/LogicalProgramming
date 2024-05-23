package Array;

public class SumOfPrimeNumbersInArray6
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sum=0;
        int size=arr.length;
        for(int i=0;i<size;i++)
        {
            int c=0;
            for(int j=1;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);

    }
}
