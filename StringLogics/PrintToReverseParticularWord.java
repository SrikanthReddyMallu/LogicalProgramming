package StringLogics;

public class PrintToReverseParticularWord
{
    public static void main(String[] args)
    {
        String s1="hello hii welcome world";
        String[] arr=s1.split(" ");
        String s3=" ";
        for(int i=0;i< arr.length;i++)
        {
            if(i%2==0)
            {
                String s2=" ";
                for(int j=arr[i].length()-1;j>=0;j--)
                {
                   s2=s2+arr[i].charAt(j);
                }
                s3=s3+s2+" ";
            }
            else
            {
                s3=s3+arr[i];
            }
        }
        System.out.println(s3);
    }
}
