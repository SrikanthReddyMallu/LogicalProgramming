package LogicPart;

public class Continue
{
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
            // If the number is 2 skip and continue here except 2 remaining all the numbers are print
            if (i == 2) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
