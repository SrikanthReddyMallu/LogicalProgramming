package Array;

public class PrintLargestNumberInArray10
{
    public static void main(String[] args) {
        int[] arr={6,3,9,2,10,15,20};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
