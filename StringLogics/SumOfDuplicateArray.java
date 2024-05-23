package StringLogics;

public class SumOfDuplicateArray
{
    public static void main(String[] args)
    {
        int[] arr1={10,20,30,40,50,60,20,40,60};
        int[] arr2={10,20,30,40,50,60,20,40,60};
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {
            int c=0;
            for(int j=0;j<arr2.length;j++)
            {

                if(arr1[i]==arr2[j])
                {
                    c++;
                    arr2[j]='0';
                }
            }
            if(c>1)
            {
                sum=sum+arr1[i];
            }
        }
        System.out.println(sum);
    }
}
