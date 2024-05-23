package Array;

public class PrimeSmallestNumberInArray9
{
    public static void main(String[] args)
    {
        int[] arr = {7, 3, 4, 9, 8};
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("The smallest number is="+min);
    }
}

