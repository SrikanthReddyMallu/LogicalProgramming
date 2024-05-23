package Array;

public class ReplaceLargestElementInArray12
{
    public static void main(String[] args)
    {
        int[] arr1={3,5,7,9,2,8};
        int n=arr1.length;
        int max=arr1[0];
        int[] arr2=new int[n];
        for(int i=1;i<n;i++)
        {
            if(arr1[i]>max)
            {
                max=arr1[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=max;
        }
        for(int j=0;j<n;j++)
        {
            System.out.println("The index is= "+j+" Value is= "+arr2[j]);
        }
    }
}
