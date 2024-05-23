package StringLogics;

public class CountNoOfWordsAndSpaces
{
    public static void main(String[] args)
    {
        String s1="hello hii how are you srikanth";
        char[] c=s1.toCharArray();
        int space=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==' ')
            {
                space++;
            }
        }
        System.out.println("No of spaces="+space);
        System.out.println("No of words="+(space+1));
    }
}
