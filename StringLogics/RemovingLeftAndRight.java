package StringLogics;

public class RemovingLeftAndRight
{
    public static void main(String[] args)
    {
        String s1="combination";
        int r=s1.length();
        int l=0;
        for(int i=0;i<r;i++)
        {
            if(i%2==0)
            {
                r--;
            }
            else
            {
                l++;
            }
            String s2=" ";
            for(int j=l;j<r;j++)
            {
                s2=s2+s1.charAt(j);
            }
            System.out.println(s2);
        }
    }
}
