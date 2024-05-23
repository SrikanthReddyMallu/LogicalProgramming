package LogicPart;

public class FebbanosisSeries
{
    public static void main(String[] args)
    {
        int n1=0;
        int n2=1;
        int sum=0;
        while(n1<=500)
        {
              if(n1>=100) {
                  System.out.println(n1);
              }
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;

        }
    }
}
