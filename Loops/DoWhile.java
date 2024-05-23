package Loops;

public class DoWhile
{
    public static void main(String[] args) {
        //The do...while loop is similar to while loop. However, the body of do...while loop is executed once before the test expression is checked. For example,
        int i = 1, n = 5;
        do {
            System.out.println(i);
            i++;
        } while(i <= n);
    }
}
