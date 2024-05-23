package IfConditions;

public class ConvertLowerToUpperCase
{
    public static void main(String[] args)
    {
        char c='a';
        if((c>='a'&&c<='z'))
        {
            c-=32;
            System.out.println(c);
            System.out.println(c+" is Upper case");
        }
        else if(c>='A'&&c<='Z')
        {
            c+=32;
            System.out.println(c);
            System.out.println(c+" is lower case");
        }
        else
        {
            System.out.println(c);
        }
    }
}
