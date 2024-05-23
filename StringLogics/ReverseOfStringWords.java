package StringLogics;

public class ReverseOfStringWords
{
    public static void main(String[] args)
    {
        String s1="hello hii srikanth welcome to the world";
        String[] arr=s1.split(" ");
        for(int i= arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
