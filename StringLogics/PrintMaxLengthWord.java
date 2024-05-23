package StringLogics;

public class PrintMaxLengthWord
{
    public static void main(String[] args)
    {
        String s1="hello hii welcome to the world";
        String[] arr=s1.split(" ");
        int max=arr[0].length();
        String ans=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()>max)
            {
                max=arr[i].length();
                ans=arr[i];
            }

        }
        System.out.println(ans);
    }
}
