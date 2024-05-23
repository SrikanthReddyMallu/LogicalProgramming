package Array;

public class BasicProgrammArray1
{
    public static void main(String[] args)
    {
        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        int[] arrs={60,50,40,30,20,10};
        for(int i=0;i<arrs.length;i++)
        {
            System.out.println("Index is="+i+" value is="+arrs[i]);
        }

    }
}
