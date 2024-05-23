package StringLogics;

public class PrintCountOfWords
{
    public static void main(String[] args)
    {
        String s1="hello hii hello hii welcome welcome to the world";
        String[] arr1=s1.split(" ");
        String[] arr2=s1.split(" ");
        for(int i=0;i< arr1.length;i++)
        {
            int count=0;
            for(int j=0;j< arr2.length;j++)
            {
                if(arr1[i].equals(arr2[j]))
                {
                    count++;
                    arr2[j]="0";
                }
            }
            if(count>1)
            {
                System.out.println(arr1[i]);
            }
        }
    }
}
