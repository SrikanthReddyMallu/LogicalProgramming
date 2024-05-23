package Loops;

public class ForLoop1To100PrimeNumbers
{

    public static void main(String[] args)
    {
        int count;

        System.out.println("Prime numbers between 1 to 100 :");
        for (int i = 1; i <= 100; i++) {
            count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print("" + i + " ");
            }
        }
    }
}
