package Array;

public class ReverseTheArray2
{
    public static void main(String[] args) {
        int[] orgArray = {10, 20, 30, 40, 50, 60};
        int n = orgArray.length;
        int[] revArray = new int[n];
        for (int i =0; i<n; i++)
        {
             revArray[i]=orgArray[n-1-i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Index is="+i+" value is="+revArray[i]);
        }
    }
}
