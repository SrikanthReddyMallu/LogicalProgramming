package IfConditions;

import java.util.Scanner;

public class IfElseAlphabetic
{
    public static void main(String[] args)
    {
        char s='A';
        if((s>='a'&&s<='z')|| (s>='A'&&s<='Z')||(s>='0'&&s<='9'))
        {
            System.out.println("Alphabetic");
        }
        else
        {
            System.out.println("numeric");
        }
    }
}
