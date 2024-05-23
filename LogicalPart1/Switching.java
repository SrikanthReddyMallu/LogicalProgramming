package LogicalPart1;

import java.util.Scanner;

public class Switching
{
    static int Add(int n1,int n2)
    {
        return (n1+n2);
    }
    static int Sub(int n1,int n2)
    {
        return (n1-n2);
    }
    static int Mul(int n1,int n2)
    {
        return (n1*n2);
    }
    static int Div(int n1,int n2)
    {
        return (n1/n2);
    }
    static int Rem(int n1,int n2)
    {
        return (n1%n2);
    }

    public static void main(String[] args)
    {

        while(true)
        {
            System.out.println("Select the option of mathematical");
            System.out.println("1.Add/n 2.Sub/n 3.Multi/n 4.Div/n 5.Remainder");
            Scanner sc=new Scanner(System.in);
            int opt= sc.nextInt();
            int n1 = 0;
            int n2 = 0;
            if(opt>=1&&opt<=5)
            {
                System.out.println("Enter the n1");
                n1=sc.nextInt();
                System.out.println("Enter the n2");
                n2=sc.nextInt();
            }
            else
            {
                System.out.println("please select the correct option");
            }
            switch (opt)
            {
                case 1:
                    System.out.println(Add(n1,n2));
                    break;
                case 2:
                    System.out.println(Sub(n1,n2));
                    break;
                case 3:
                    System.out.println(Mul(n1,n2));
                    break;
                case 4:
                    System.out.println(Div(n1,n2));
                    break;
                case 5:
                    System.out.println(Rem(n1,n2));
                    break;

            }
        }
    }
}
