package Array;

public class ReplaceTheEachArrayElementWithSameFactorial8
{
    public static void main(String[] args)
    {
        int[] arr1={2,3,4,5,6};
        int n=arr1.length;
        int[] arr2=new int[n];
        for(int i=0;i<n;i++)
        {
            int pow=1;
            for(int j=1;j<=arr1[i];j++)
            {
                pow=pow*j;
            }
            arr2[i]=pow;
        }
        for (int i=0;i<n;i++)
        {
            System.out.println("The index is= "+i+" Value is= "+arr2[i]);
        }

    }
}
