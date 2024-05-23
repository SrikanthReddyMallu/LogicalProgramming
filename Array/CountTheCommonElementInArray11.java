package Array;

public class CountTheCommonElementInArray11
{
    public static void main(String[] args)
    {
        int[] arr={4,5,6,10,7,10,8,10} ;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==10)
          {
              count++;
          }
        }
        System.out.println("The common number 10 comes "+count+" times");
    }
}
