package Array;

public class SumOfFibbanosisInArray7
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n1=0;
        int n2=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            n1=arr[i];
            sum=sum+n1;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
