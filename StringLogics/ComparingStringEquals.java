package StringLogics;

public class ComparingStringEquals
{
    public static void main(String[] args)
    {
        String s1=new String("hello");
        String s2=new String("hello");
        String s3="hello";
        String s4="hello";
        System.out.println(s1.equals(s2));  //when we will comapare the String object values then we will use "s1.equals(s2)"
        System.out.println(s3==s4);         //when we will compare the normal String values then we will use "s1==s2"

    }
}
