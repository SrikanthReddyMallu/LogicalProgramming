package Loops;

public class ForLoopMulti
{
    public static void main(String[] args) {
        int fact=1;
        for (int i=1;i<=5;i++)
        {
             fact=fact*i;
            System.out.println(fact);
        }
        System.out.println(fact);
    }
}