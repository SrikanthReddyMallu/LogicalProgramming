package IfConditions;

import java.util.Scanner;

public class IfElseEqual
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();

        if((n1>n2)||(n1<n2))
        {
            System.out.println("Both are not equal");
        }
        else
        {
            System.out.println("Both are equal");
        }
    }
}
