package LogicPart;

public class Remainder
{
    public static void main(String[] args)
    {
        //If last digit is 0 or 5 print Zero or five else print last digit is even or odd
     int n=5647;
     int rem=n%10;
     if(rem==0)
     {
         System.out.println("zero");
     }
     else if(rem==5)
     {
         System.out.println("Five");
     }
     else if(rem%2==0)
     {
         System.out.println("even");
     }
     else
     {
         System.out.println("odd");
     }
    }
}
