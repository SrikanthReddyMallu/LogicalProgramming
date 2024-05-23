package ConvertCharToInt;

public class SwappingOfTwoMembers
{
    public static void main(String[] args)
    {
        int a=20;
        int b=40;
        //Before the swapping
        System.out.println(a+" and "+b);
        int c=0;
        c=a;
        a=b;
        b=c;
        //After the swapping
        System.out.println(a+" and "+b);

        int d=40;
        int e=50;
        //Before the swapping
        System.out.println(d+" And "+e);
        d=d+e;
        e=d-e;
        d=d-e;
        //After the swapping
        System.out.println(d+" And "+e);

    }
}
